package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import pl.sda.zdjavapol4.moviesrentalwebapp.models.Client;

import java.util.List;

public interface ClientService {

    void save(Client client);

    List<Client> getAll();

    void update(Client client);

    void delete (Long clientId);

    Client getByLogin (String login);



}
