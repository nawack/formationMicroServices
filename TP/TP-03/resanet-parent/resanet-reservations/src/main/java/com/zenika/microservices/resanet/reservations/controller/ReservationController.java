package com.zenika.microservices.resanet.reservations.controller;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.zenika.microservices.resanet.reservations.domain.SavedReservation;
import com.zenika.microservices.resanet.reservations.dto.Reservation;
import com.zenika.microservices.resanet.reservations.repository.ReservationRepository;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

	private ReservationRepository reservationRepository;

	@Inject
	public ReservationController(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}

	@RequestMapping(method=RequestMethod.POST)
	private ResponseEntity<Void> addReservation(@RequestBody Reservation reservation, UriComponentsBuilder uriComponentsBuilder){

		SavedReservation savedReservation = new SavedReservation(reservation);
		reservationRepository.save(savedReservation);
		
		URI location = uriComponentsBuilder.path("/carts/{cartId}")
				.buildAndExpand(savedReservation.getId()).toUri();
		return ResponseEntity.created(location).build();

	}
	
	@RequestMapping(method=RequestMethod.GET)
	private List<SavedReservation> getReservations(){
		return reservationRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{reservationId}")
	private SavedReservation readReservation(@PathVariable Long reservationId){
		return reservationRepository.findOne(reservationId);
	}
}
