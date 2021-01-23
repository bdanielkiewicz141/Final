package pl.sda.zdjavapol4.moviesrentalwebapp.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Copy {

    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    Movie movie;

    @Enumerated(EnumType.ORDINAL)
    CopyStatus copyStatus;

    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;

}

