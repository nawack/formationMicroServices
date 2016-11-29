package com.zenika.microservices.resanet.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2

// TODO 01 : Ajouter l'annotation pour SpringBoot et demander de scanner les packages de services et controller
@SpringBootApplication(scanBasePackages={"com.zenika.microservices.resanet.controller",
"com.zenika.microservices.resanet.services"})
// TODO 02 : Ajouter l'annotation pour scanner les entités JPA dans le package domain
@EntityScan(basePackages={"com.zenika.microservices.resanet.domain"})
// TODO 03 : Ajouter l'annotation pour rajouter les repository Spring-Data Jpa depuis repository
@EnableJpaRepositories(basePackages={"com.zenika.microservices.resanet.repository"})
public class Application  {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
