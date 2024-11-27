package com.example.restaurants.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;
    private String nomRestaurant;

    private String adresseRestaurant; // Adresse du restaurant
    
    private Date dateOuverture;        // Date d'ouverture du restaurant
    private String email;              // Email de contact du restaurant

    @ManyToOne
    private Type type; // Type du restaurant

    public Restaurant() {
        super();
    }

    public Restaurant(String nomRestaurant, String adresseRestaurant, Date dateOuverture, String email) {
        super();
        this.nomRestaurant = nomRestaurant;
        this.adresseRestaurant = adresseRestaurant;
        this.dateOuverture = dateOuverture;
        this.email = email;
    }

    public Long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Long idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getNomRestaurant() {
        return nomRestaurant;
    }

    public void setNomRestaurant(String nomRestaurant) {
        this.nomRestaurant = nomRestaurant;
    }

    public String getAdresseRestaurant() {
        return adresseRestaurant;
    }

    public void setAdresseRestaurant(String adresseRestaurant) {
        this.adresseRestaurant = adresseRestaurant;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Restaurant [idRestaurant=" + idRestaurant + ", nomRestaurant=" + nomRestaurant + 
                ", adresseRestaurant=" + adresseRestaurant + ", dateOuverture=" + dateOuverture +
                ", email=" + email + "]";
    }
}
