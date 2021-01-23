package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.zdjavapol4.moviesrentalwebapp.exceptions.MovieAlreadyExistsException;
import pl.sda.zdjavapol4.moviesrentalwebapp.exceptions.NoMovieInStockException;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Copy;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;
import pl.sda.zdjavapol4.moviesrentalwebapp.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public List<Movie> findAll() {
        List<Movie> movieList = (List<Movie>) movieRepository.findAll();

        return movieList;
    }

    public Optional<Movie> findById(Long id) {


        return Optional.empty();
    }

    public Optional<Movie> findMovie(String title) {

        return movieRepository.findByTitle(title);
    }

    public Optional<Movie> findByTitle(String title) {
        return Optional.empty();
    }

    public Movie saveMovie(Movie objectToSave) {
        log.info("saving movie");
        var saved = movieRepository.save(objectToSave);
        log.info("object before saving: [{}] and after: [{}]", objectToSave, saved);
        return saved;

    }

    public Copy getCopy(Movie movie) throws NoMovieInStockException {
        return null;
    }

    public Movie addMovie(Movie movie) throws MovieAlreadyExistsException {
        return null;
    }
}
