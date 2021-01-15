package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Copy;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Genre;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Movie;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class MovieRepositoryClass {


    public List<Movie> filmy(){
        var baza = new ArrayList<Movie>();
        List<Movie> filmy1= new ArrayList<>();
        List<Copy> list1 = new ArrayList<>();
        var die_Hard = Movie.builder()
                .movieId(1L)
                .title("Die_Hard")
                .copies(list1)
                .genre(Genre.ACTION)
                .avgScore(10)
                .discription("abc")
                .build();
        baza.add(die_Hard);
        return baza;
    }

}
