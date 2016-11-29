package com.zenika.microservices.resanet.catalog.domain;



public class Ville {

    private String nom;

    private Pays pays;

    public Ville() {
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
