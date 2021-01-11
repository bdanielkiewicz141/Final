package pl.sda.zdjavapol4.moviesrentalwebapp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue
    Long orderId;

    @Column
    Copy copyID;

    @Column
    Movie movieID;

    @Column
    String courier;

    @Column
    String orderStatus;

    @Column
    Client clientID;

    @Column
    LocalDate RentDate;

    @Column
    LocalDate Returndate;

//    dodać daty, i itd.
}
