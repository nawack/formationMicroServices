package com.zenika.microservices.resanet.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//TODO 02 ajouter l'annotation pour mettre en place le config serveur
@SpringBootApplication
@EnableConfigServer
public class ConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationApplication.class, args);
	}

}
