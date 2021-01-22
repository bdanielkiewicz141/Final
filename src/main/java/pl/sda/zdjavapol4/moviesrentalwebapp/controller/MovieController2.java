package pl.sda.zdjavapol4.moviesrentalwebapp.controller;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.MovieService;

@Slf4j
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MovieController2 {
    public static final String TITLE = "title";
    public static final String GENRE = "genre";
    private final MovieService movieService;

//    public MovieController2(MovieService movieService){
//        this.movieService = movieService;
//    }

//    @GetMapping("/all-movies")
//    public String movies(Model model, @RequestParam(value = "title", required = false, defaultValue = "Film") String title,
//                         @RequestParam(value = "genre", required = false, defaultValue = "Horror") String genre) {
//        var allMovies = movieService.findAll();
//        log.info("my all coffee machines request");
//        model.addAttribute(TITLE, title);
//        model.addAttribute(GENRE, genre);
//        return "all-movies";


}

