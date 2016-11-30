package com.zenika.microservices.resanet.reservations.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.zenika.microservices.resanet.reservations.domain.Reservation;

public interface ReservationRepository extends PagingAndSortingRepository<Reservation, Long> {

}
