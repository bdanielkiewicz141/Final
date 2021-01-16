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
                Movie.builder().title("Iron man").genre(Genre.ACTION).releaseDate(LocalDate.of(1992, 3, 4)).build(),
                Movie.builder().title("Iron man2").genre(Genre.DOCUMENTARY).releaseDate(LocalDate.of(1992, 3, 5)).build()

        ));

    }
}
