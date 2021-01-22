package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import pl.sda.zdjavapol4.moviesrentalwebapp.exceptions.MovieAlreadyExistsException;
import pl.sda.zdjavapol4.moviesrentalwebapp.exceptions.NoMovieInStockException;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Copy;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Genre;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Service
public interface MovieService {

    List<Movie> findAll();

    Optional<Movie> findById(Long Id);

    Movie findMovie(String title);

    Optional<Movie> findByTitle(String title);

    void save (Movie movie);

//    List<Movie> findAllByGenre (Genre genre);
//
//    List<Movie> findByReleaseDate (LocalDate releaseDate1, LocalDate releaseDate2);

    Copy getCopy(Movie movie) throws NoMovieInStockException;

    Movie addMovie(Movie movie) throws MovieAlreadyExistsException;






}
