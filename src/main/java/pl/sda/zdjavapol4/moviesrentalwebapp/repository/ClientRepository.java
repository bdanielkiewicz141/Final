package pl.sda.zdjavapol4.moviesrentalwebapp.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Client;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Movie;

import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    public Optional<Client> findByEmail(String email);
    public Optional<Client> findByFullName(String fullName);
    public Optional<Client> findByLogin(String login);
    public Optional<Client> findById(Long clientId);

}
