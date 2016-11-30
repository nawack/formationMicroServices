package com.zenika.microservices.resanet.reservations.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "RESERVATION")
public class Reservation extends AbstractBusinessObject {

    @Temporal(TemporalType.DATE)
    private Date dateReservation;

    // Pour reservation -> transport
    //@ManyToMany
    //@JoinTable(
    //        name = "RESERVATION_TRANSPORT",
    //        joinColumns = @JoinColumn(name = "RESERVATIONS_ID"),
    //        inverseJoinColumns =  @JoinColumn(name="TRANSPORTS_ID")
    //)
    // Pour transport -> reservation
    //@Transient
    // Pour transport <-> réservation
    //@ManyToMany(mappedBy = "reservations")
    // Pour bidirectionnalité
    //@ManyToMany
    //@JoinTable(
    //        name = "RESERVATION_TRANSPORT",
    //        joinColumns = @JoinColumn(name = "RESERVATIONS_ID"),
    //        inverseJoinColumns = @JoinColumn(name = "TRANSPORTS_ID")
    //)
    // Pour fetch EAGER

    // Pour reservation -> facture
    //@OneToOne
    //@JoinColumn(unique = true)
    // Pour reservation -> facture avec couplage du cycle de vie
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Facture facture;

    //@Transient
    // Pour les composants (pas besoin de @Embedded, le composant est déjà @Embeddable)
    private Adresse adresseLivraison;

    //@Transient
    // Pour les composants (pas besoin de @Embedded, le composant est déjà @Embeddable)
    @ElementCollection
    @CollectionTable(
            name = "RESERVATION_VOYAGEURS",
            joinColumns = @JoinColumn(name = "RESERVATION_ID"))
    private Set<Voyageur> voyageurs = new HashSet<>();

    public Adresse getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(Adresse adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Set<Voyageur> getVoyageurs() {
        return voyageurs;
    }

    public void setVoyageurs(Set<Voyageur> voyageurs) {
        this.voyageurs = voyageurs;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

}
