package com.zenika.microservices.resanet.reservations.starter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan 
public class Application  {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
        
        System.out.println("valeur de la config"+configUrl);
    
    }
    
    @Value("${spring.datasource.url}")
    private static String configUrl;
    
}
