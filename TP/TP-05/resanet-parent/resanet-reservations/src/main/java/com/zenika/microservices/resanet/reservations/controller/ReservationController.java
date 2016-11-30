package com.zenika.microservices.resanet.reservations.controller;

import java.net.URI;

import javax.inject.Inject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.zenika.microservices.resanet.reservations.domain.Reservation;
import com.zenika.microservices.resanet.reservations.repository.ReservationRepository;

@RestController
@RequestMapping(value="/reservations")
public class ReservationController {

	private ReservationRepository reservationRepository;

	@Inject
	public ReservationController(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}

	@RequestMapping(value="/", method=RequestMethod.POST)
	public ResponseEntity<Void> addReservation(@RequestBody Reservation reservation, UriComponentsBuilder uriComponentsBuilder){
		Reservation savedReservation = reservationRepository.save(reservation);

		URI location = uriComponentsBuilder.path("/reservations/{reservationId}")
				.buildAndExpand(savedReservation.getId()).toUri();

		return ResponseEntity.created(location).build();
	}

}
