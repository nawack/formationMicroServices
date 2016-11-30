package com.zenika.microservices.resanet.catalog.repository;

import com.zenika.microservices.resanet.catalog.domain.Transport;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends ElasticsearchRepository<Transport,Long>, PagingAndSortingRepository<Transport, Long> {

}
