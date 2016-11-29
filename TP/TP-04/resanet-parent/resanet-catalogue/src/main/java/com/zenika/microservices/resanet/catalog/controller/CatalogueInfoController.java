package com.zenika.microservices.resanet.catalog.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogueInfoController {
	
	@Value("${catalogue.version:manuelle}")
	private String catalogueVersion;
	
	@RequestMapping(method=RequestMethod.GET, path="/infos")
	public String getValue(){
		return catalogueVersion;
	}
}
