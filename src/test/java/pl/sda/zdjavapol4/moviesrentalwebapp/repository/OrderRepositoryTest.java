package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Client;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Copy;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Order;
import java.util.Optional;

@DataJpaTest
public class OrderRepositoryTest {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CopyRepository copyRepository;

    @Test
    public void client_makes_order() {

        Long clientId = 123L;
        Long copyId = 456L;
        Long copyId1 = 654L;
        Long orderId = 789L;

        Client c3 = new Client();
        c3.setClientId(clientId);

        Copy copy = new Copy();
        copy.setId(copyId);
        Copy copy1 = new Copy();
        copy1.setId(copyId1);

        Order o = new Order();
        o.setOrderId(orderId);

        Optional<Order> foundOrderOptional = orderRepository.findById(orderId);
        Optional<Client> foundOrderOptional1 = clientRepository.findById(clientId);
        Optional<Copy> foundOrderOptional2 = copyRepository.findById(copyId);
        Optional<Copy> foundOrderOptional3 = copyRepository.findById(copyId1);
        Assertions.assertThat(foundOrderOptional.isEmpty()).isTrue();
        Assertions.assertThat(foundOrderOptional1.isEmpty()).isTrue();
        Assertions.assertThat(foundOrderOptional2.isEmpty()).isTrue();
        Assertions.assertThat(foundOrderOptional3.isEmpty()).isTrue();

        orderRepository.save(o);
        copyRepository.save(copy);
        copyRepository.save(copy1);
        clientRepository.save(c3);

        foundOrderOptional = orderRepository.findById(orderId);
        foundOrderOptional1 = clientRepository.findById(clientId);
        foundOrderOptional2 = copyRepository.findById(copyId);
        foundOrderOptional3 = copyRepository.findById(copyId1);
        Assertions.assertThat(foundOrderOptional.isPresent()).isTrue();
        Assertions.assertThat(foundOrderOptional1.isPresent()).isTrue();
        Assertions.assertThat(foundOrderOptional2.isPresent()).isTrue();
        Assertions.assertThat(foundOrderOptional3.isPresent()).isTrue();

        Order foundOrder = foundOrderOptional.get();
        Client foundOrder1 = foundOrderOptional1.get();
        Copy foundOrder2 = foundOrderOptional2.get();
        Copy foundOrder3 = foundOrderOptional3.get();

        Assertions.assertThat(foundOrder.getOrderId()).isEqualTo(o.getOrderId());
        Assertions.assertThat(foundOrder1.getClientId()).isEqualTo(o.getClientId());
        Assertions.assertThat(foundOrder2.getId()).isEqualTo(o.getCopyId());
        Assertions.assertThat(foundOrder3.getId()).isEqualTo(o.getCopyId());



    }

}