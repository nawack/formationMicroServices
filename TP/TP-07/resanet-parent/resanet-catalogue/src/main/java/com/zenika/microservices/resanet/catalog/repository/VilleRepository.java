package com.zenika.microservices.resanet.catalog.repository;


import com.zenika.microservices.resanet.catalog.domain.Ville;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleRepository extends ElasticsearchRepository<Ville,Long>, PagingAndSortingRepository<Ville, Long> {

}
