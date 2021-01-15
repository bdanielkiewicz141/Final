package pl.sda.zdjavapol4.moviesrentalwebapp;

import org.springframework.boot.test.context.SpringBootTest;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Copy;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Movie;
import pl.sda.zdjavapol4.moviesrentalwebapp.repository.CopyRepository;
import pl.sda.zdjavapol4.moviesrentalwebapp.repository.MovieRepository;

@SpringBootTest
public class MovieRepositoryTest {

    //given
//    Movie m = new Movie(1L);
    Movie m = Movie.builder()
            .movieId(1L)
            .build();
    Copy c1 = new Copy(1L);
    Copy c2 = new Copy(2L);

//m.setCopyId(1, 2);


//when
//            MovieRepository.save(m);
//then
//CopyRepository.getCopiesForMovie(id=1)--->c1,c2;
}
