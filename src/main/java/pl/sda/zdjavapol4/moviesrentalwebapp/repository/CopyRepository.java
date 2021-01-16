package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Copy;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Movie;

import java.util.List;
import java.util.Optional;

@Repository
public interface CopyRepository extends CrudRepository<Copy, Long> {

    List<Copy> findAllByMovie(Movie movie);    //prawdopodobnie uzyje movieId do wyszukania

    List<Copy> findAll();

}
