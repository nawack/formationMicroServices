package com.zenika.microservices.resanet.catalog.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;



@Document(indexName = "ville")
public class Ville {

	@Id
	private String id;
	
    private String nom;

    private Pays pays;

    public Ville() {
    }

    public String getId() {
		return id;
	}
    
    public void setId(String id) {
		this.id = id;
	}
    
    public Ville(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
