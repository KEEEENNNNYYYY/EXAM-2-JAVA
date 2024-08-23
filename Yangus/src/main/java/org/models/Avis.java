package org.models;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Avis {
    private List <Avis> listeDesHotelsReview;
    private  List <Avis> listeDesChambresReview;
    private String utilisateur;
    private String emailUtilise;
    private Hotel hotelANoter;
    private int note;
    private String description;
    private LocalDate dateDePoste;


    public Avis(String utilisateur, Hotel hotelANoter, String emailUtilise, int note, String description) {
        this.utilisateur=  utilisateur;
        this.emailUtilise = emailUtilise;
        this.hotelANoter=  hotelANoter;
        this.note = note;
        this.description=  description;
        this.dateDePoste =  LocalDate.now();
    }

    public int getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "l'utilisateur "+ utilisateur + " avec l'email "+emailUtilise+" a noté "+ hotelANoter.nom + " avec un score de: "+note + "en disant que "+description + " posté le :"+ dateDePoste;
    }
}
