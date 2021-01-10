package pl.sda.zdjavapol4.moviesrentalwebapp.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Review {

    @Id
    @GeneratedValue
     int reviewID;
     int rate;
     int clientID;
     //komentarz do usuniecia 

}
