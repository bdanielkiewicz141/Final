package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import org.springframework.stereotype.Service;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Client;

import java.util.List;

@Service
public interface ClientService {

    void save(Client client);

    List<Client> getAll();

    void update(Client client);

    void delete (Long clientId);

    Client getByLogin (String login);



}
