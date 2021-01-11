package pl.sda.zdjavapol4.moviesrentalwebapp.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Copy {

@Id
@GeneratedValue
    Long copyID;

@ManyToOne
    Movie movieID;
    String copyStatus;

}
