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

@DataJpaTest
public class CopyRepositoryTest {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private CopyRepository copyRepository;

    @Test
    public void add_copy_to_movie() {
        //given
        String title = "Die Hard";

        Movie m2 = new Movie();
        m2.setTitle(title);
        m2.setReleaseDate(LocalDate.of(1989,10,15));

       String title1 = "Avatar";

        Movie m3 = new Movie();
        m3.setTitle(title1);
        m3.setReleaseDate(LocalDate.of(2005,6,10));

        //create related copies

        Copy c3 = new Copy();
        c3.setCopyStatus(CopyStatus.RESERVED);
        c3.setMovie(m2);
        Copy c4 = new Copy();
        c4.setCopyStatus(CopyStatus.LOST);
        c4.setMovie(m2);
        Copy c5 = new Copy();
        c5.setCopyStatus(CopyStatus.RENTED);
        c5.setMovie(m3);

        List<Copy> copies = new ArrayList<>();
        copies.add(c3);
        copies.add(c4);
        //add copies list to movie
        m2.setCopies(copies);

        List<Copy> copies1 = new ArrayList<>();
        copies1.add(c5);
        m3.setCopies(copies1);

        Optional<Movie> foundMovieOptional = movieRepository.findByTitle(title);
        Optional<Movie> foundMovieOptional1 = movieRepository.findByTitle(title1);
        Assertions.assertThat(foundMovieOptional.isEmpty()).isTrue();
        Assertions.assertThat(foundMovieOptional1.isEmpty()).isTrue();

        //when
        movieRepository.save(m2);
        movieRepository.save(m3);
        foundMovieOptional = movieRepository.findByTitle(title);
        foundMovieOptional1 = movieRepository.findByTitle(title1);
        Assertions.assertThat(foundMovieOptional.isPresent()).isTrue();
        Assertions.assertThat(foundMovieOptional1.isPresent()).isTrue();
        Movie foundMovie = foundMovieOptional.get();
        Movie foundMovie1 = foundMovieOptional1.get();


        List<Copy> foundCopies = copyRepository.findAll();
        //then
        Assertions.assertThat(foundMovie.getTitle()).isEqualTo(m2.getTitle());
        Assertions.assertThat(foundMovie1.getTitle()).isEqualTo(m3.getTitle());
        Assertions.assertThat(foundMovie.getReleaseDate()).isEqualTo(m2.getReleaseDate());
        Assertions.assertThat(foundMovie1.getReleaseDate()).isEqualTo(m3.getReleaseDate());
        Assertions.assertThat(foundCopies.isEmpty()).isFalse();

    }
}
