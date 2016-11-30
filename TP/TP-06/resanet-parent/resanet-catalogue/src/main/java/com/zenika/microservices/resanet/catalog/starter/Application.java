package com.zenika.microservices.resanet.catalog.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Import;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2


@SpringBootApplication(scanBasePackages={"com.zenika.microservices.resanet.catalog.services","com.zenika.microservices.resanet.catalog.controller"})
//@EnableEurekaClient
//TODO 03a ajouter le MBean Export
@EnableMBeanExport
//TODO 04a permettre l'activation de Hystrix
@EnableCircuitBreaker
@Import(ElasticSearchConfiguration.class)
public class Application  {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    
}