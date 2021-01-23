package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import org.springframework.stereotype.Service;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Client;

import java.util.List;

@Service
public class DefaultClientService implements ClientService{
    @Override
    public void save(Client client) {

    }

    @Override
    public List<Client> getAll() {
        return null;
    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(Long clientId) {

    }

    @Override
    public Client getByLogin(String login) {
        return null;
    }
}
