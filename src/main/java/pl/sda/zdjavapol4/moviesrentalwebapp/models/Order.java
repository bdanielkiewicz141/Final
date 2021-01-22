package pl.sda.zdjavapol4.moviesrentalwebapp.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue
    Long orderId;

    @ManyToOne
// (mappedBy = "order")
    Copy copyId;

//    Movie movieId;

    String courier;

    String orderStatus;

    @ManyToOne
    Client clientId;

    LocalDate rentDate;

    LocalDate returnDate;

}
