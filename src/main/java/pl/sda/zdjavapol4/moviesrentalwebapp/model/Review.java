package pl.sda.zdjavapol4.moviesrentalwebapp.model;

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
    Long reviewId;

    BigDecimal rate;

//    @OneToOne(mappedBy = "movie")
    Long clientId;

//    @OneToMany
//    Movie movieId;

}
