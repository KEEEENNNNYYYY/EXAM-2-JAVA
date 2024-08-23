package org.models;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Hotel hotel1 = new Hotel(
                "Mahamanina",
                121.56,
                65.45,
                "Hotel dans le sujet",
                "mahamanina@gmail.com",
                "666"
        );
        Hotel hotel2 = new Hotel(
                "Mahamanina2",
                120.56,
                654.45,
                "Hotel dans le sujet2",
                "mahamanina@gmail.2",
                "6662"
        );

        Chambre chambre1 = new Chambre("1",2000,"random avis");
        Chambre chambre2 = new Chambre("2",4000,"random avis");
        Chambre chambre3 = new Chambre("3",6000,"random avis");
        Chambre chambre4 = new Chambre("4",8000,"random avis");

        hotel1.addChambre(chambre1);
        hotel1.addChambre(chambre2);
        hotel1.addChambre(chambre3);
        hotel1.addChambre(chambre4);

        hotel1.getContact();

        hotel1.addReview("bob","bob@gmail.com",hotel1,5,"critique pour l'hotel");
        hotel2.addReview("bob","bob@gmail.com",hotel2,5,"critique pour l'hotel");

        System.out.println(Hotel.getGetAllReview());


    }
}