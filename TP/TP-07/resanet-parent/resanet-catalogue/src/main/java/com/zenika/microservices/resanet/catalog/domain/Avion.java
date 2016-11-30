package com.zenika.microservices.resanet.catalog.domain;

import java.util.Date;

public class Avion extends Transport {

	private String compagnie;
	private String typeAppareil;

	public Avion() {
	}

	public Avion(Ville villeDepart, Ville villeArrivee, Date dateDepart) {
		super(villeDepart, villeArrivee, dateDepart);
	}

	public String getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}

	public String getTypeAppareil() {
		return typeAppareil;
	}

	public void setTypeAppareil(String typeAppareil) {
		this.typeAppareil = typeAppareil;
	}

}
