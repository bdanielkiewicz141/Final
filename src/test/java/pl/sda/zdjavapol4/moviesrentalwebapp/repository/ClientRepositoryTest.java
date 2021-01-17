package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Client;


import java.util.Optional;


@DataJpaTest
public class ClientRepositoryTest {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ClientRepository clientRepository;

    @Test
    public void save_client() {

        String login = "boomer";
        String fullName = "Wacław Zdobywca";
        String email = "waclaw.zdobywca@gmail.com";

        Client c1 = new Client();
        c1.setLogin(login);
        c1.setFullName(fullName);
        c1.setEmail(email);

        String login1 = "starlight";
        String fullName1 = "Helena Gwiazdorska";
        String email1 = "helena.gwiazdorska@gmail.com";

        Client c2 = new Client();
        c2.setLogin(login1);
        c2.setFullName(fullName1);
        c2.setEmail(email1);


        Optional<Client> foundClientOptional = clientRepository.findByFullName(fullName);
        Optional<Client> foundClientOptional1 = clientRepository.findByFullName(fullName1);
        Optional<Client> foundClientOptional2 = clientRepository.findByEmail(email);
        Optional<Client> foundClientOptional3 = clientRepository.findByEmail(email1);
        Optional<Client> foundClientOptional4 = clientRepository.findByLogin(login);
        Optional<Client> foundClientOptional5 = clientRepository.findByLogin(login1);
        Assertions.assertThat(foundClientOptional.isEmpty()).isTrue();
        Assertions.assertThat(foundClientOptional1.isEmpty()).isTrue();
        Assertions.assertThat(foundClientOptional2.isEmpty()).isTrue();
        Assertions.assertThat(foundClientOptional3.isEmpty()).isTrue();
        Assertions.assertThat(foundClientOptional4.isEmpty()).isTrue();
        Assertions.assertThat(foundClientOptional5.isEmpty()).isTrue();


        //when
        clientRepository.save(c1);
        clientRepository.save(c2);

        foundClientOptional = clientRepository.findByFullName(fullName);
        foundClientOptional5 = clientRepository.findByLogin(login1);
        Assertions.assertThat(foundClientOptional.isPresent()).isTrue();
        Assertions.assertThat(foundClientOptional5.isPresent()).isTrue();
        Client foundClient = foundClientOptional.get();
        Client foundClient1 = foundClientOptional5.get();

        //then
        Assertions.assertThat(foundClient.getFullName()).isEqualTo(c1.getFullName());
        Assertions.assertThat(foundClient1.getLogin()).isEqualTo(c2.getLogin());
    }

}
