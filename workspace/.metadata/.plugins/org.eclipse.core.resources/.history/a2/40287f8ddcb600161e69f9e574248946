package com.zenika.microservices.resanet.catalog.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.zenika.microservices.resanet.catalog.domain.Train;
import com.zenika.microservices.resanet.catalog.services.TransportService;

@RestController
@RequestMapping("/trains")
public class TrainController {

	@Autowired
	private TransportService transportService;

	@RequestMapping(path="/",method=RequestMethod.POST)
	public ResponseEntity<Void> addVille(@RequestBody Train train, UriComponentsBuilder builder){
		String transportId  = transportService.ajouterTransport(train);
		URI location = builder.path("/transports/{transportId}").buildAndExpand(transportId).toUri();
		return ResponseEntity.created(location).build();
	}
	
}
