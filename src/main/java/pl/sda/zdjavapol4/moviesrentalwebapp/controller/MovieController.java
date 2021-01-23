package pl.sda.zdjavapol4.moviesrentalwebapp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.MovieService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Slf4j
@RequestMapping("/movie")
@RequiredArgsConstructor
@Controller
public class MovieController {

    public static final String TITLE = "title";
    public static final String GENRE = "genre";
    private static final String MOVIES = "movies";
    private final MovieService movieService;

//    public MovieController2(MovieService movieService){
//        this.movieService = movieService;
//    }

    @GetMapping("/all-movies")
    public String FindMovies(Model model) {
        var allMovies = movieService.findAll();
        log.info("my all movies request");
        model.addAttribute(MOVIES, allMovies);
        return "all-movies";
    }

    @GetMapping("/all-movies2")
    public String FindMovies(Model model, @RequestParam(value = "title", required = true) String title,
                             @RequestParam(value = "genre", required = true) String genre) {
        var allMovies = movieService.findAll();
        log.info("my all movies request");
        model.addAttribute(TITLE, title);
        model.addAttribute(GENRE, genre);
        model.addAttribute(MOVIES, allMovies);
        return "all-movies";
    }

    @PostMapping("/create_movie")
    public ResponseEntity<Movie> createMovie(@RequestBody final Movie objectToSave) {
        log.info("New movie has been created", objectToSave);

        var saved = movieService.saveMovie(objectToSave);
        return ResponseEntity.created(URI.create("movies/movie" + saved.getId()))
                .body(saved);

    }

//        Movie newMovie = movieService.addMovie(movie);
//        return ResponseEntity
//                .created(URI.create(("/" + newMovie.getId())))
//                .body(newMovie);
//    }




//    }

    @GetMapping(value = "/movieRest")
    public List<Movie> myMovies () {
        log.info("rest all my movies");
        return movieService.findAll();

    }
    @GetMapping(value = "/singleMovie")
    public Optional<Movie> selectMovie (@RequestParam(required = true) String title){
        log.info("single movie");
        return movieService.findByTitle("Die Hard");

    }
}

