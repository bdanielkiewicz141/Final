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
@Table(name = "CLIENT")
public class Client {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientID;

    private String login;
    private String email;
    private String adress;
    private String fullName;
    private long cardNumber;


@OneToMany
private List<Order> orders;
}