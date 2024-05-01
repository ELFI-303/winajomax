package com.wina.jo.max.demo.service;

import java.util.Iterator;
import java.util.List;

import com.wina.jo.max.demo.Entity.GambleEvent;
import com.wina.jo.max.demo.repository.CustomerRepository;
import com.wina.jo.max.demo.repository.GambleEventRepository;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import static java.lang.Long.parseLong;

@Path("gamble")
public class GambleEventService {
    @Autowired
    private GambleEventRepository gambleEventRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerService customerService;
    @POST
    @Consumes(value = "application/json")
    public boolean saveGambleEvents(@NotNull @RequestBody String jsonString) throws JSONException {
        Long userId = customerService.getUserId();
        JSONObject jsonObject = new JSONObject(jsonString);
        Iterator<String> kays = jsonObject.keys();
        double amount = 0;
        while (kays.hasNext()) {
            String key = kays.next();
            amount += jsonObject.getJSONObject(key).getDouble("amount");
        }
        //Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Double solde = customerRepository.getCustomerSolde(userId);
        if (amount <= solde){
            Iterator<String> keys = jsonObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                GambleEvent gamble = new GambleEvent(
                        jsonObject.getJSONObject(key).getLong("gambleId"),
                        userId,
                        jsonObject.getJSONObject(key).getJSONObject("olympicEvent").toString(),
                        jsonObject.getJSONObject(key).getDouble("amount"),
                        jsonObject.getJSONObject(key).getString("pay"));
                gambleEventRepository.save(gamble);
            }
            customerService.updateCustomerSolde(-amount);
            return true;
        }
        return false;
    }
    @GET
    @Produces(value = "application/json")
    public List<GambleEvent> getGambleById() {
        Long userId = customerService.getUserId();
        List<GambleEvent> gambles = gambleEventRepository.getCustomerGambles(userId);
        if(!gambles.isEmpty()){
            return gambles;
        }
        return null;
    }
}