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

import com.fasterxml.jackson.annotation.ObjectIdGenerators.UUIDGenerator;
import com.google.common.collect.Lists;
import com.zenika.microservices.resanet.catalog.domain.Ville;
import com.zenika.microservices.resanet.catalog.repository.VilleRepository;

public class VilleController {

	private VilleRepository villeRepository;
	
	@Inject
	public VilleController(final VilleRepository villeRepository) {
		this.villeRepository = villeRepository;
	}

	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public List<Ville> getVilles(){
		return Lists.newArrayList(villeRepository.findAll());
	}
	
	@RequestMapping(path="/",method=RequestMethod.POST)
	public ResponseEntity<Void> addVille(@RequestBody Ville ville, UriComponentsBuilder builder){
		ville = villeRepository.save(ville);
		URI location = builder.path("/villes/{villeId}").buildAndExpand(ville.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
}
