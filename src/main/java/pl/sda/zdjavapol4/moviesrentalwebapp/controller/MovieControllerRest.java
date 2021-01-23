package pl.sda.zdjavapol4.moviesrentalwebapp.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.zdjavapol4.moviesrentalwebapp.exceptions.MovieAlreadyExistsException;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;
import pl.sda.zdjavapol4.moviesrentalwebapp.repository.RepositoryTestMovie;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.MovieService;

import java.net.URI;
import java.util.List;

@Slf4j
@RequestMapping("/rest")
@RestController
@RequiredArgsConstructor

public class MovieControllerRest {

    private final MovieService movieService;
    private RepositoryTestMovie repositoryTestMovie;


//    public MovieControllerRest(MovieService movieService) {
//        this.movieService = movieService;
//    }

    @PostMapping("/create_movie")
    public ResponseEntity<Movie> createMovie(@RequestBody final Movie objectToSave) {
        log.info("New movie has been created", objectToSave);

        var saved = movieService.saveMovie(objectToSave);
        return ResponseEntity.created(URI.create("rest/movie/" + saved.getId()))
                .body(saved);
    }

//    @GetMapping(value = "/movieRest")
//    public List<Movie> myMovies(){
//        log.info("rest all my movies");
//        return movieService.findAll();
//
//    }
//        @GetMapping(value = "/singleMovie")
//    public Optional<Movie> selectMovie(@RequestParam( required = true) String title){
//        log.info("single movie");
//        return movieService.findByTitle("Die Hard");
//
//    }

    @GetMapping("/movie-list2")
    public List<Movie> getAllMovies() {
        log.info("Return all movie list");
        return movieService.findAll();
    }

//
//    @GetMapping({"/movies"})
//    public String getMovieIndex(Model model) {
//        model.addAttribute("movies", service.getAll());
//        return "movies/index";
//    }
//
//    @PostMapping("/save-movie")
//    public String saveMovie(@ModelAttribute Movie movie) {
//        service.save(movie);
//        log.info("Added movie: " + movie);
//
//        return "redirect:/movies";
//}

    //    @CrossOrigin(origins = "http://localhost:3000")
//    @PostMapping("/movie-list")
//    public ResponseEntity<?> createMovie(@RequestBody final Movie movie) throws MovieAlreadyExistsException {
//        log.info("New movie has been created");
//        Movie newMovie = movieService.addMovie(movie);
//        return ResponseEntity
//                .created(URI.create(("/" + newMovie.getId())))
//                .body(newMovie);
//    }

    @PutMapping("/movie-list/{id}")
    public ResponseEntity<?> updateMovie(@PathVariable("id") Long id, @RequestBody final Movie movie) {
        if (movieService.findById(id).isPresent()) {
            movie.setId(id);
            movieService.saveMovie(movie);
            log.info("movie " + movie + "has been updated");
            return ResponseEntity
                    .noContent()
                    .build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
