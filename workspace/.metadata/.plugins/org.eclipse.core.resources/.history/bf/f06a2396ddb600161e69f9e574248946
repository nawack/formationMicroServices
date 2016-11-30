package com.zenika.microservices.resanet.catalog.domain;

import java.util.HashSet;
import java.util.Set;

public class Pays {

    private String nom;

    private Set<Ville> villes = new HashSet<Ville>();

    public Pays() {
    }

    public Pays(String unNom) {
        this.nom = unNom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Ville> getVilles() {
        return villes;
    }

    public void setVilles(Set<Ville> villes) {
        this.villes = villes;
    }

    public void ajouterVille(Ville ville) {
        Pays pays = ville.getPays();
        if (pays != null && !pays.equals(this)) {
            pays.retirerVille(ville);
        }
        ville.setPays(this);
        villes.add(ville);
    }

    public void retirerVille(Ville ville) {
        if (this.equals(ville.getPays())) {
            ville.setPays(null);
            villes.remove(ville);
        }
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
