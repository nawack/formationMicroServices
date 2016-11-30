package com.zenika.microservices.resanet.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zenika.microservices.resanet.catalog.domain.Transport;
import com.zenika.microservices.resanet.catalog.services.TransportService;

@RestController
@RequestMapping("/transports")
public class TransportController {

	@Autowired
	private TransportService transportService;
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public List<Transport> getTransports(){
		return transportService.findAll();
	}
	
}
