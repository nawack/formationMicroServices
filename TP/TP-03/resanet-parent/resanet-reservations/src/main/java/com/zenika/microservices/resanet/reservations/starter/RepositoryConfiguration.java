package com.zenika.microservices.resanet.reservations.starter;

import com.zenika.microservices.resanet.reservations.listeners.ReservationEventHandler;

public class RepositoryConfiguration {


	  ReservationEventHandler reservationEventHandler() {
	    return new ReservationEventHandler();
	  }

	
	
}
