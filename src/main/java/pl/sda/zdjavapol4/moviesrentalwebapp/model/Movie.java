package pl.sda.zdjavapol4.moviesrentalwebapp.model;


import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MOVIES")

public class Movie {

    @Id
    @GeneratedValue
    Long movieId;

    public Movie(Long movieId) {
        this.movieId = movieId;
    }

    @Column(nullable = false)
//    @NotNull(message = "Title must not be null")
    String title;



    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    Genre genre;

    @Column(nullable = false)
    LocalDate releaseDate;

//        @DecimalMin("0.0")
//    @DecimalMax("10.0")
    double avgScore;

    @Type(type = "text")
//        @Size(min= 100, max= 500)
    String discription;

    //to pole ma nie byc zapisywane w bazie danych
    @Transient
    long daysFromRelease;


    BigDecimal basePrice; // cena bedzie ustalana na podstawie relase date


    @OneToMany(orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
//    @JoinColumn(name = "movie_id")
    List<Copy> copies;

    @OneToMany
    List<Review> reviews;

     public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate relaseDate) {
        this.releaseDate = relaseDate;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public String getDiscreption() {
        return discription;
    }

    public void setDiscreption(String discreption) {
        this.discription = discreption;
    }

    @PostLoad
    public void calcDaysFromRelease() {
        this.daysFromRelease = ChronoUnit.DAYS.between(releaseDate, LocalDate.now());
    }

    public long getDaysFromRelease() {
        return daysFromRelease;
    }

    public void setDaysFromRelease(long daysFromRelease) {
        this.daysFromRelease = daysFromRelease;
    }

//    ewentualnie dodać equals hash code

}

