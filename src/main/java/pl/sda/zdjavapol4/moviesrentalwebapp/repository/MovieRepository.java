package pl.sda.zdjavapol4.moviesrentalwebapp.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Copy;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Genre;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Movie;

import javax.print.attribute.standard.Copies;
import java.util.ArrayList;
import java.util.List;
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

    @Override
    public String save (Movie movie);




}
