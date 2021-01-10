package pl.sda.zdjavapol4.moviesrentalwebapp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDER")
public class Order {

    @Id
    @GeneratedValue
     Long copyID;


     int movieID;

     String courier;
     String orderStatus;
     int clientID;

//    dodać daty, i to do
}
