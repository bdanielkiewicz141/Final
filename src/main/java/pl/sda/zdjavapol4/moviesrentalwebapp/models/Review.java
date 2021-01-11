package pl.sda.zdjavapol4.moviesrentalwebapp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "REVIEWS")
public class Review {

    @Id
    @GeneratedValue
    Long reviewID;

    BigDecimal rate;

    @OneToOne(mappedBy = "movie")
    Client clientID;

}
