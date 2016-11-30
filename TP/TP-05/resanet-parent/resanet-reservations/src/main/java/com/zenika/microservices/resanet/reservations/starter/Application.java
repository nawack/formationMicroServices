package com.zenika.microservices.resanet.reservations.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication(scanBasePackages={"com.zenika.microservices.resanet.reservations.controller"})
@EnableJpaRepositories(basePackages={"com.zenika.microservices.resanet.reservations.repository"})
@EntityScan(basePackages={"com.zenika.microservices.resanet.reservations.domain"})
public class Application  {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    
}
