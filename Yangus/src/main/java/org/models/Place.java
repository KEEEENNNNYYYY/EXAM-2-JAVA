package org.models;

import java.util.List;

public abstract class Place {
    protected String nom;
    protected double latitude;
    protected double longitude;
    protected String description;
    private List<Avis> avis;

}