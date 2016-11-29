package com.zenika.microservices.resanet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application")
public class ApplicationController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getApplicationVersion(){
		return "0.1";
	}
	
	
}
