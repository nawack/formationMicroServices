package com.zenika.microservices.resanet.catalog.domain;

import java.util.Date;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="transport", type="avion")
public class Train extends Transport {

    private int nbWagons;

    private boolean voitureBar;

    public Train() {
    	super();
    }
    
    public Train(Ville villeDepart, Ville villeArrivee, Date dateDepart) {
    	super(villeDepart, villeArrivee, dateDepart);
    }
    
	public int getNbWagons() {
		return nbWagons;
	}

	public void setNbWagons(int nbWagons) {
		this.nbWagons = nbWagons;
	}

	public boolean isVoitureBar() {
		return voitureBar;
	}

	public void setVoitureBar(boolean voitureBar) {
		this.voitureBar = voitureBar;
	}
 }
