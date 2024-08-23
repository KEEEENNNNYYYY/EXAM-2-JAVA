package org.models;

public class Chambre {
    private String numero;
    private int prixParNuite;
    private String avis;

    Chambre (String numero,int prixParNuite,String avis){
        this.numero = numero;
        this.prixParNuite = prixParNuite;
        this.avis = avis;

    }

    @Override
    public String toString() {
        return "Chambre numero: "+numero+",prix par nuite:"+prixParNuite;
    }
}
