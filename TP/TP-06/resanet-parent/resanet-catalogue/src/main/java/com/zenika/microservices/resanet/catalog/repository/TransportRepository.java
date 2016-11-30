package com.zenika.microservices.resanet.catalog.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.zenika.microservices.resanet.catalog.domain.Transport;

public interface TransportRepository extends ElasticsearchRepository<Transport, String>{

}
