package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Genre;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;

import java.time.LocalDate;
import java.util.Arrays;

@Repository
public class RepositoryTestMovie {
    @Bean
    public ApplicationRunner initializer(MovieRepository repository) {
        return args -> repository.saveAll(Arrays.asList(
                Movie.builder().title("Iron man").genre(Genre.ACTION).releaseDate(LocalDate.of(2008, 4, 14)).build(),
                Movie.builder().title("Die Hard").genre(Genre.ACTION).releaseDate(LocalDate.of(1988, 7, 12)).build(),
                Movie.builder().title("The Silence of the Lambs").genre(Genre.THRILLER).releaseDate(LocalDate.of(1991, 1, 30)).build(),
                Movie.builder().title("The Sixth Sense").genre(Genre.THRILLER).releaseDate(LocalDate.of(1999, 8, 2)).build(),
                Movie.builder().title("Sweeney Todd: The Demon Barber of Fleet Street").genre(Genre.MUSICAL).releaseDate(LocalDate.of(2007, 12, 3)).build(),
                Movie.builder().title("La La Land").genre(Genre.MUSICAL).releaseDate(LocalDate.of(2016, 8, 31)).build(),
                Movie.builder().title("Forest Gump").genre(Genre.COMEDY).releaseDate(LocalDate.of(1994, 6, 23)).build(),
                Movie.builder().title("The Hangover").genre(Genre.COMEDY).releaseDate(LocalDate.of(2009, 5, 30)).build(),
                Movie.builder().title("The Shining").genre(Genre.HORROR).releaseDate(LocalDate.of(1980, 5, 23)).build(),
                Movie.builder().title("Interview with the Vampire: The Vampire Chronicles").genre(Genre.HORROR).releaseDate(LocalDate.of(1994, 11, 9)).build(),
                Movie.builder().title("Matrix").genre(Genre.SCI_FI).releaseDate(LocalDate.of(1999, 3, 24)).build(),
                Movie.builder().title("Avatar").genre(Genre.SCI_FI).releaseDate(LocalDate.of(2009, 12, 10)).build(),
                Movie.builder().title("The Green Mile").genre(Genre.DRAMA).releaseDate(LocalDate.of(1999, 12, 6)).build(),
                Movie.builder().title("The Shawshank Redemption").genre(Genre.DRAMA).releaseDate(LocalDate.of(1994, 9, 10)).build(),
                Movie.builder().title("Crazy, Stupid, Love.").genre(Genre.ROMANCE).releaseDate(LocalDate.of(2011, 7, 19)).build(),
                Movie.builder().title("The Tourist").genre(Genre.ROMANCE).releaseDate(LocalDate.of(2010, 12, 6)).build(),
                Movie.builder().title("Potop").genre(Genre.HISTORICAL).releaseDate(LocalDate.of(1974, 9, 2)).build(),
                Movie.builder().title("Ogniem i mieczem").genre(Genre.HISTORICAL).releaseDate(LocalDate.of(1999, 2, 8)).build(),
                Movie.builder().title("Sugar Man").genre(Genre.DOCUMENTARY).releaseDate(LocalDate.of(2012, 1, 19)).build(),
                Movie.builder().title("Amy").genre(Genre.DOCUMENTARY).releaseDate(LocalDate.of(2015, 5, 16)).build()

        ));

    }
}
