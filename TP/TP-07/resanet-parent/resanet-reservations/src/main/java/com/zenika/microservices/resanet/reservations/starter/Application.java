package com.zenika.microservices.resanet.reservations.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages={"com.zenika.microservices.resanet.reservations.controller"})
@EnableJpaRepositories(basePackages={"com.zenika.microservices.resanet.reservations"})
@EntityScan(basePackages={"com.zenika.microservices.resanet.reservations.domain"})
public class Application  {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    
}
