package com.zenika.microservices.resanet.reservations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenika.microservices.resanet.reservations.domain.SavedReservation;

public interface ReservationRepository extends JpaRepository<SavedReservation, Long> {

}
