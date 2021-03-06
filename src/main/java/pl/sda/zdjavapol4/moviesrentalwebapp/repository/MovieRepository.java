package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;

import java.util.Optional;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

    public Optional<Movie> findByTitle(String title);

}
