package pl.sda.zdjavapol4.moviesrentalwebapp.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.MovieService;

import java.util.List;
import java.util.Optional;

@Slf4j

@RequestMapping("/rest")
@RestController

public class MovieControllerRest {

private final MovieService movieService;



    public MovieControllerRest(MovieService movieService) {
        this.movieService = movieService;
    }



    @GetMapping(value = "/movieRest")
    public List<Movie> myMovies(){
        log.info("rest all my movies");
        return movieService.findAll();

    }
        @GetMapping(value = "/singleMovie")
    public Optional<Movie> selectMovie(@RequestParam( required = true) String title){
        log.info("single movie");
        return movieService.findMovie("Die Hard");

    }


}
