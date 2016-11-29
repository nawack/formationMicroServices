package com.zenika.microservices.resanet.reservations.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication(scanBasePackages={"com.zenika.microservices.resanet.reservations.controller","com.zenika.microservices.resanet.reservations.listeners"})
@EnableJpaRepositories(basePackages={"com.zenika.microservices.resanet.reservations.repository"})
@EntityScan(basePackages={"com.zenika.microservices.resanet.reservations.domain"})
//TODO 03
//TODO 06
public class Application  {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    
}
