package com.zenika.microservices.resanet.catalog.domain;

import java.util.Date;

public abstract class Transport  {

	private Date dateDepart;

	private String heureDepart;
	private String heureArrivee;
	private double prix;
	private int nbSiegesTotal;
	private int nbSiegesDispo;

    private Ville villeArrivee;

    private Ville villeDepart;

	public Transport() {

	}

	public Transport(Ville villeDepart, Ville villeArrivee, Date dateDepart) {
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.dateDepart = dateDepart;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public int getNbSiegesDispo() {
		return nbSiegesDispo;
	}

	public void setNbSiegesDispo(int nbSiegesDispo) {
		this.nbSiegesDispo = nbSiegesDispo;
	}

	public int getNbSiegesTotal() {
		return nbSiegesTotal;
	}

	public void setNbSiegesTotal(int nbSiegesTotal) {
		this.nbSiegesTotal = nbSiegesTotal;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Ville getVilleArrivee() {
		return villeArrivee;
	}

	public void setVilleArrivee(Ville villeArrivee) {
		this.villeArrivee = villeArrivee;
	}

	public Ville getVilleDepart() {
		return villeDepart;
	}

	public void setVilleDepart(Ville villeDepart) {
		this.villeDepart = villeDepart;
	}

	public String getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}

	public String getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

    @Override
    public String toString() {
        return "Transport{" +
                "villeDepart=" + villeDepart +
                ", villeArrivee=" + villeArrivee +
                ", dateDepart=" + dateDepart +
                ", heureDepart='" + heureDepart + '\'' +
                ", prix=" + prix +
                '}';
    }
}
