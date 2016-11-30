package com.zenika.microservices.resanet.catalog.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages={"com.zenika.microservices.resanet.catalog","com.zenika.microservices.resanet.metric"})
@EnableElasticsearchRepositories("com.zenika.microservices.resanet.catalog.repository")
public class Application  {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    
}
