package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;

import java.util.List;
import java.util.Optional;


@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

    public Optional<Movie> findByTitle(String title);
    public Optional<Movie> findById(Long Id);
//    public List<Movie> findAll(Movie movie);



}
