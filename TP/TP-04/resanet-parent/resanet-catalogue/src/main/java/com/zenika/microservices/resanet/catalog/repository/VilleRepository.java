package com.zenika.microservices.resanet.catalog.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.zenika.microservices.resanet.catalog.domain.Ville;

public interface VilleRepository extends ElasticsearchRepository<Ville, String> {

}
