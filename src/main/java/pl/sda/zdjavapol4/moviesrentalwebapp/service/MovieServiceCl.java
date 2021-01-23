package pl.sda.zdjavapol4.moviesrentalwebapp.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;
import pl.sda.zdjavapol4.moviesrentalwebapp.repository.MovieRepository;

import java.util.List;

import static com.jayway.jsonpath.Filter.filter;

@Slf4j
@Service

public class MovieServiceCl {

    private final MovieRepository movieRepository;

    public MovieServiceCl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie findMovieById(Long id) {
        var result = giveMeMovies().stream()
                .filter(movie -> movie.getId() == id)
                .findFirst()
                .orElse(null);
        log.info("find movie with id: [{}] = [{}]", id, result);
        return result;
    }

    public List<Movie> giveMeMovies(){
        var movies = movieRepository.findAll();

        log.info("movies: {}", movies);
        return (List<Movie>) movies;
    }
}
