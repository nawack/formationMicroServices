package com.zenika.microservices.resanet.reservations.dto;

import java.util.Date;

public class Reservation {

    private Date date;
    
    private Customer customer;

    private String transportId;
    
    private Place place;
    
    private String price;
    
    private String currency;
    
    private Adress billingAdress;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getTransportId() {
		return transportId;
	}

	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Adress getBillingAdress() {
		return billingAdress;
	}

	public void setBillingAdress(Adress billingAdress) {
		this.billingAdress = billingAdress;
	}
    
    
}
