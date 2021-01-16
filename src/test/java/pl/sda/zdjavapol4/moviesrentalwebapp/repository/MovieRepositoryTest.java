package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Copy;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.CopyStatus;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@DataJpaTest    //testujemy tylko warstwe persystencji
public class MovieRepositoryTest {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private CopyRepository copyRepository;

    @Test
    public void saves_movie_and_related_copies() {
        //given
        String title = "Ogniem i Mieczem";

        Movie m1 = new Movie();
        m1.setTitle(title);
        m1.setReleaseDate(LocalDate.of(1999, 2, 11));

        Copy c1 = new Copy();
        c1.setCopyStatus(CopyStatus.AVAILABLE);
        Copy c2 = new Copy();
        c2.setCopyStatus(CopyStatus.RENTED);

        List<Copy> copies = new ArrayList<>();
        copies.add(c1);
        copies.add(c2);

        m1.setCopies(copies);

        Optional<Movie> foundMovieOptional = movieRepository.findByTitle(title);
        Assertions.assertThat(foundMovieOptional.isEmpty()).isTrue();

        //when
        movieRepository.save(m1);
        foundMovieOptional = movieRepository.findByTitle(title);
        Assertions.assertThat(foundMovieOptional.isPresent()).isTrue();
        Movie foundMovie = foundMovieOptional.get();

/*        Copy c1 = new Copy();
        c1.setCopyStatus(CopyStatus.AVAILABLE);
        c1.setMovie(m1);
        Copy c2 = new Copy();
        c2.setMovie(m1);
        c2.setCopyStatus(CopyStatus.RENTED);

        copyRepository.save(c1);
        copyRepository.save(c2);*/

        List<Copy> foundCopies = copyRepository.findAll();

        //then
        Assertions.assertThat(foundMovie.getTitle()).isEqualTo(m1.getTitle());
        Assertions.assertThat(foundMovie.getReleaseDate()).isEqualTo(m1.getReleaseDate());

        Assertions.assertThat(foundCopies.isEmpty()).isFalse();
    }

}
