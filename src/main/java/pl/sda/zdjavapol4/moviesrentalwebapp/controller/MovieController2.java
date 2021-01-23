package pl.sda.zdjavapol4.moviesrentalwebapp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.sda.zdjavapol4.moviesrentalwebapp.exceptions.MovieAlreadyExistsException;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.MovieService;

import java.net.URI;

@Slf4j
@RequestMapping("/movies")
@RequiredArgsConstructor
@Controller
public class MovieController2 {
    //    public static final String TITLE = "title";
//    public static final String GENRE = "genre";
    public static final String TITLE = "title";
    public static final String GENRE = "genre";
    private final MovieService movieService;

//    public MovieController2(MovieService movieService){
//        this.movieService = movieService;
//    }

    @GetMapping("/all-movies")
    public String movies(Model model, @RequestParam(value = "title", required = false, defaultValue = "Die Hard") String title,
                         @RequestParam(value = "genre", required = false, defaultValue = "Horror") String genre) {
        var allMovies = movieService.findAll();
        log.info("my all movies request");
        model.addAttribute(TITLE, title);
        model.addAttribute(GENRE, genre);
        return "all-movies";
    }

    @PostMapping("/movie-list")
    public ResponseEntity<?> createMovie(@RequestBody final Movie objectToSave) {
        log.info("New movie has been created", objectToSave);

        var saved = movieService.saveMovie(objectToSave);
        return ResponseEntity.created(URI.create("movies/movie" + saved.getId()))
                .body(saved);

//        Movie newMovie = movieService.addMovie(movie);
//        return ResponseEntity
//                .created(URI.create(("/" + newMovie.getId())))
//                .body(newMovie);
//    }


    }
}

