package com.wina.jo.max.demo.repository;

import com.wina.jo.max.demo.Entity.GambleEvent;
import com.wina.jo.max.demo.Entity.PassedGambleEvent;
import com.wina.jo.max.demo.service.CustomerService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;


@Component
public class UpdateSolde {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private GambleEventRepository gambleEventRepository;
    @Autowired
    private PassedGambleEventRepository passedGambleEventRepository;
    @Scheduled(cron = "0 * * * * *")
    public synchronized void update() {
        LocalDateTime nowDateTime = LocalDateTime.now();
        List<GambleEvent> gambles = gambleEventRepository.findAll();
        for(GambleEvent gamble:gambles){
            JSONObject jsonGamble = new JSONObject(gamble.getOlympicEvent());
            LocalDateTime eventDateTime = LocalDateTime.parse(jsonGamble.getString("dateTime"));
            if (eventDateTime.isBefore(nowDateTime) && passedGambleEventRepository.findById(jsonGamble.getLong("gambleId"))
                    .isEmpty()){
                PassedGambleEvent passed = new PassedGambleEvent(gamble.getGambleId(),gamble.getUserId(),gamble.getOlympicEvent(),
                        gamble.getAmount(),gamble.getPay());
                passedGambleEventRepository.save(passed);
                JSONObject jsonCote = jsonGamble.getJSONObject("cote");
                String result = jsonGamble.getString("result");
                String bet = gamble.getPay();
                if ( bet == result ){
                    Double updatedGains = jsonCote.getDouble(bet)*gamble.getAmount();
                    customerService.updateCustomerSolde(updatedGains);
                }
            }
        }
    }
}