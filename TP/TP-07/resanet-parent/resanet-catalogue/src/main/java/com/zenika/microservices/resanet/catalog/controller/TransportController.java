package com.zenika.microservices.resanet.catalog.controller;

import com.zenika.microservices.resanet.catalog.domain.Transport;
import com.zenika.microservices.resanet.catalog.repository.TransportRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.inject.Inject;


@CrossOrigin
@RestController
@RequestMapping("/transport")
public class TransportController {

    private final TransportRepository transportRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(TransportController.class);


    @Inject
    public TransportController(TransportRepository transportRepository) {
        this.transportRepository = transportRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Transport> readTransports() {
        LOGGER.trace("Reading all transports");
        return transportRepository.findAll();
    }

    @RequestMapping(value = "/{transportId}", method = RequestMethod.GET)
    public Transport readTransports(@PathVariable Long transportId) {
        LOGGER.trace("Reading transport {}", transportId);
        return transportRepository.findOne(transportId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Transport> addTransport(@RequestBody Transport transport) {
        LOGGER.trace("Add transport {}", transport);
        transport = transportRepository.save(transport);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(transport.getId()).toUri());


        return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
    }


}