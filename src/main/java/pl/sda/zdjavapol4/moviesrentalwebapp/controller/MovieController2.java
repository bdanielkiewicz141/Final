package pl.sda.zdjavapol4.moviesrentalwebapp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.DefaultMovieService;

@Slf4j
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MovieController2 {
//    public static final String TITLE = "title";
//    public static final String GENRE = "genre";
    private final DefaultMovieService movieService;

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

