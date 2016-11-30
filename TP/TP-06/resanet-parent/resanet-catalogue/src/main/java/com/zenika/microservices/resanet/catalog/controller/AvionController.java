package com.zenika.microservices.resanet.catalog.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.zenika.microservices.resanet.catalog.domain.Avion;
import com.zenika.microservices.resanet.catalog.services.TransportService;

@RestController
@RequestMapping("/avions")
public class AvionController {

	@Autowired
	private TransportService transportService;
	
	@RequestMapping(path="/",method=RequestMethod.POST)
	public ResponseEntity<Void> addVille(@RequestBody Avion avion, UriComponentsBuilder builder){
		String transportId  = transportService.ajouterTransport(avion);
		URI location = builder.path("/transports/{transportId}").buildAndExpand(transportId).toUri();
		return ResponseEntity.created(location).build();
	}
	
}
