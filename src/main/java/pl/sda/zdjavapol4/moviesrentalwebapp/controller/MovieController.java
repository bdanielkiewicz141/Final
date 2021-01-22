package pl.sda.zdjavapol4.moviesrentalwebapp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.zdjavapol4.moviesrentalwebapp.exceptions.MovieAlreadyExistsException;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;
import pl.sda.zdjavapol4.moviesrentalwebapp.repository.RepositoryTestMovie;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.MovieService;

import java.net.URI;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MovieController {

    private MovieService movieService;
    private RepositoryTestMovie repositoryTestMovie;

    @GetMapping("/movie-list")
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
    @PostMapping("/movie-list")
    public ResponseEntity<?> createMovie(@RequestBody final Movie movie) throws MovieAlreadyExistsException {
        log.info("New movie has been created");
        Movie newMovie = movieService.addMovie(movie);
        return ResponseEntity
                .created(URI.create(("/" + newMovie.getId())))
                .body(newMovie);
    }

    @PutMapping("/movie-list/{id}")
    public ResponseEntity<?> updateMovie(@PathVariable("id") Long id, @RequestBody final Movie movie) {
        if (movieService.findById(id).isPresent()) {
            movie.setId(id);
            movieService.save(movie);
            log.info("movie " + movie + "has been updated");
            return ResponseEntity
                    .noContent()
                    .build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

