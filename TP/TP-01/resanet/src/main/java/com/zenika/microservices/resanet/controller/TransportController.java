package com.zenika.microservices.resanet.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.zenika.microservices.resanet.domain.Transport;
import com.zenika.microservices.resanet.repository.TransportRepository;


@CrossOrigin
@RestController
@RequestMapping("/transport")
public class TransportController {

	private final TransportRepository transportRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(TransportController.class);
	
	
	@Inject
	public TransportController(TransportRepository transportRepository){
		this.transportRepository = transportRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Transport> readTransports() {
		return transportRepository.findAll();
	}
	
	@RequestMapping(value = "/{transportId}", method = RequestMethod.GET)
	public Transport readTransports(@PathVariable Long transportId) {
		return transportRepository.findOne(transportId);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Transport> addTransport(@RequestBody Transport transport) {
		transport = transportRepository.save(transport);

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(transport.getId()).toUri());
		

        return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
	}
	
	
	
}