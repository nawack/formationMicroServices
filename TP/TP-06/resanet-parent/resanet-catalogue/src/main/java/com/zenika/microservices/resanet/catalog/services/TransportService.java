package com.zenika.microservices.resanet.catalog.services;

import java.util.List;

import com.zenika.microservices.resanet.catalog.domain.Transport;

public interface TransportService {

	String ajouterTransport(Transport transport);
	
	List<Transport> findAll();


}
