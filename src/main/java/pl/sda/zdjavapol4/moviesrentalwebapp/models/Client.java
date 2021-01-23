package pl.sda.zdjavapol4.moviesrentalwebapp.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Getter
@Setter
//@Table(name = "CLIENT")
public class Client {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String login;
    private String email;
    private String address;
    private String fullName;
    private long cardNumber;


@OneToMany(mappedBy = "client", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
private List<Order> orders;
}