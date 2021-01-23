package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import org.springframework.stereotype.Service;
import pl.sda.zdjavapol4.moviesrentalwebapp.exceptions.MovieAlreadyExistsException;
import pl.sda.zdjavapol4.moviesrentalwebapp.exceptions.NoMovieInStockException;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Copy;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultMovieService implements MovieService{
    @Override
    public List<Movie> findAll() {
        return null;
    }

    @Override
    public Optional<Movie> findById(Long Id) {
        return Optional.empty();
    }

    @Override
    public Movie findMovie(String title) {
        return null;
    }

    @Override
    public Optional<Movie> findByTitle(String title) {
        return Optional.empty();
    }

    @Override
    public void save(Movie movie) {

    }

    @Override
    public Copy getCopy(Movie movie) throws NoMovieInStockException {
        return null;
    }

    @Override
    public Movie addMovie(Movie movie) throws MovieAlreadyExistsException {
        return null;
    }
}
