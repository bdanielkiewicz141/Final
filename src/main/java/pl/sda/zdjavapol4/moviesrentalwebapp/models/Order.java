package pl.sda.zdjavapol4.moviesrentalwebapp.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
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

    @OneToOne
    Copy copyID;

//    @OneToMany(mappedBy = "order")
//    Movie movieID;

    @Column
    String courier;

    @Column
    String orderStatus;

    @OneToOne
    Client clientID;

    @Column
    LocalDate rentDate;

    @Column
    LocalDate returnDate;

}
