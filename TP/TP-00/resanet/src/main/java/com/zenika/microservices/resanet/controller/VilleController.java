package com.zenika.microservices.resanet.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zenika.microservices.resanet.domain.Ville;
import com.zenika.microservices.resanet.repository.VilleRepository;

@RestController
@RequestMapping("/villes")
public class VilleController {

	private final VilleRepository villeRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(VilleController.class);
	
	@Inject
	public VilleController(final VilleRepository villeRepository) {
		this.villeRepository = villeRepository;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Ville> getList() {
		LOGGER.info("demande de la liste des villes");
		return villeRepository.findAll();
	}
	
	@RequestMapping(value = "/{villeId}", method = RequestMethod.GET)
	public Ville readVille(@PathVariable Long villeId) {
		LOGGER.info("demande de la ville : "+villeId);
		return villeRepository.findOne(villeId);
	}
	
	
}
