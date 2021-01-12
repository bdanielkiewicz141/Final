package pl.sda.zdjavapol4.moviesrentalwebapp.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;

import java.util.Optional;

@Repository

public interface MovieRepository extends CrudRepository<Movie, Long> {


    @Override
    public Optional<Movie> findById(Long aLong);

    @Override
    public boolean existsById(Long aLong);

    @Override
    public Iterable<Movie> findAll();

    @Override
    public Iterable<Movie> findAllById(Iterable<Long> iterable);

    @Override
    public long count();


}
