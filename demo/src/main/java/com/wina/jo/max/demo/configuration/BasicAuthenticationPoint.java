
package com.wina.jo.max.demo.configuration;
/*
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class BasicAuthenticationPoint extends BasicAuthenticationEntryPoint {
    public String cookie;
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authEx)
            throws IOException {
        if (cookie != "Basic dXNlcjpwYXNzd29yZA=="){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            PrintWriter writer = response.getWriter();
            writer.println("HTTP erroooor 401 - " + authEx.getMessage() + response.getStatus());
            cookie = "";
        } else {
            afterPropertiesSet();
        }
    }
    @Override
    public void afterPropertiesSet() {
        setRealmName("@Authenticated");
        cookie = getRealmName().toString();
        super.afterPropertiesSet();
    }
}*/