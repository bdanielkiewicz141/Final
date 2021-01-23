package pl.sda.zdjavapol4.moviesrentalwebapp.models;


import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue
   private   Long id;

    //@Column(nullable = false)
//    @NotNull(message = "Title must not be null")
   private String title;

    //@Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
   private Genre genre;

    //@Column(nullable = false)
    LocalDate releaseDate;

    //        @DecimalMin("0.0")
//    @DecimalMax("10.0")
  private   double avgScore;

    @Type(type = "text")
//        @Size(min= 100, max= 500)
   private String description;

    //to pole ma nie byc zapisywane w bazie danych
    @Transient
   private long daysFromRelease;


    private BigDecimal basePrice; // cena bedzie ustalana na podstawie relase date


    @OneToMany(orphanRemoval = true,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "movie")
//    @JoinColumn(name = "movie_id")
    List<Copy> copies;

    @OneToMany
    List<Review> reviews;

    @PostLoad
    public void calcDaysFromRelease() {
        this.daysFromRelease = ChronoUnit.DAYS.between(releaseDate, LocalDate.now());
    }

}

