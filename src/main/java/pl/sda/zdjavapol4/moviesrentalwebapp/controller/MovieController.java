package pl.sda.zdjavapol4.moviesrentalwebapp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sda.zdjavapol4.moviesrentalwebapp.exceptions.MovieAlreadyExistsException;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;
//import pl.sda.zdjavapol4.moviesrentalwebapp.repository.MovieRepository;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.MovieService;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MovieController {

    private MovieService movieService;

//    @GetMapping({"/movie-list"})
//    public ResponseEntity List<Movie> getAllMovies() {
//        log.info("Return all movie list");
//        var a = movieService.findAll();
//
//        log.info(a.get(2).getTitle());
//        return movieService.findAll();
//    }

    @GetMapping("/movie-list")
    public ResponseEntity<List<Movie>> getAllMovies(){
        log.info("Return all movie list");
        return ResponseEntity
                .ok()
                .body(movieService.findAll());
    }


//    @GetMapping({"/movies"})
//    public String getMovieIndex(Model model) {
//        model.addAttribute("movies", service.getAll());
//        return "movies/index";
//    }

//    //    @CrossOrigin(origins = "http://localhost:3000")
//    @PostMapping("/movie-list")
//    public ResponseEntity<?> createMovie(@RequestBody final Movie movie) throws MovieAlreadyExistsException {
//        log.info("New movie has been created");
//        Movie newMovie = movieService.addMovie(movie);
//        return ResponseEntity
//                .created(URI.create(("/" + newMovie.getId())))
//                .body(newMovie);
//    }
}

