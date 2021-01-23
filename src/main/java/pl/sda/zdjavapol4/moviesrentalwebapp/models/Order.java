package pl.sda.zdjavapol4.moviesrentalwebapp.models;

import lombok.*;
import pl.sda.zdjavapol4.moviesrentalwebapp.repository.OrderRepository;

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
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue
    Long orderId;

    @OneToMany(mappedBy = "order")
    List<Copy> copies;

//    Movie movieId;

    String courier;

    String orderStatus;

    @ManyToOne
    @JoinColumn(name = "client_id")
    Client client;

    LocalDate rentDate;

    LocalDate returnDate;

}
