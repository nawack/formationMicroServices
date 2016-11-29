package com.zenika.microservices.resanet.reservations.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//TODO 02
public class ReservationEventHandler {

	//TODO 09
	
	private Logger LOGGER = LoggerFactory.getLogger(ReservationEventHandler.class);
	
	public void reservationCreateEvent(Object o){
		LOGGER.info(o.toString());
	}
	
	public void reservationModifiedEvent(Object o){
		LOGGER.info(o.toString());
	}
	
	public void reservationDeletedEvent(Object o){
		LOGGER.info(o.toString());

	}
	
}
