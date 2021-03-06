package com.zenika.microservices.resanet.catalog.controller;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.google.common.collect.Lists;
import com.zenika.microservices.resanet.catalog.domain.Transport;
import com.zenika.microservices.resanet.catalog.repository.TransportRepository;

public class TransportController {

	private TransportRepository transportRepository;
	
	@Inject
	public TransportController(final TransportRepository transportRepository) {
		this.transportRepository = transportRepository;
	}
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public List<Transport> getTransports(){
		return Lists.newArrayList(transportRepository.findAll());
	}
	
	@RequestMapping(path="/",method=RequestMethod.POST)
	public ResponseEntity<Void> addVille(@RequestBody Transport transport, UriComponentsBuilder builder){
		transport = transportRepository.save(transport);
		URI location = builder.path("/transports/{transportId}").buildAndExpand(transport.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
}
