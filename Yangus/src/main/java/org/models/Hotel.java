package org.models;

import java.time.LocalDate;
import java.util.*;

public class Hotel extends Place{
    private List <Avis> avis;
    private String email;
    private String telephone;
    private List<Chambre> ListeDeChambres;
    private List<Parc>parcAProximite;



    Hotel(String nom,double latitude,double longitude,String descritption,String email,String telephone){
        this.nom = nom;
        this.latitude= latitude;
        this.longitude= longitude;
        this.description= descritption;
        this.email= email;
        this.telephone = telephone;
        this.ListeDeChambres = new ArrayList<Chambre>();

    }

    static List <Avis> AllReview = new ArrayList<Avis>();
    static List <Avis> AllNote = new ArrayList<Avis>();
    

    public static List<Avis> getGetAllReview() {
        return AllReview;
    }

    public void getContact(){
        System.out.println("Le conctact de l'hotel: mail= "+this.email+",telephone= "+this.telephone);
    }
    public void addReview( String utilisateur,String emailUtilise,Hotel hotelANoter,int note,String description){
        Avis avis1 = new Avis(utilisateur,hotelANoter,emailUtilise,note,description);
        AllReview.add(avis1);
        /*System.out.println(avis1);*/
    }

    public void addChambre(Chambre chambre){
        ListeDeChambres.add(chambre);
    }
    public void getListeDeChambre(){
        System.out.println(this.ListeDeChambres);
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "avis=" + avis +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", ListeDeChambres=" + ListeDeChambres +
                ", parcAProximite=" + parcAProximite +
                ", listeDesHotelsReview=" +
                '}';
    }

}
