package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Client;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Copy;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Order;

import java.util.ArrayList;
import java.util.List;
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
        Long orderId = 789L;
        Long copyId = 456L;
        Long copyId1 = 654L;

        Order o = new Order();
        o.setOrderId(orderId);


        Client c3 = new Client();
        c3.setClientId(clientId);

        Copy copy = new Copy();
        copy.setId(copyId);
        o.setCopyId(copy);
//        Copy copy1 = new Copy();
//        copy1.setId(copyId1);
//        o.setCopyId(copy1);

        List<Order> orderList = new ArrayList<>();
        orderList.add(o);
        o.setClientId(c3);
        c3.setOrders(orderList);

        Optional<Order> foundOrderOptional = orderRepository.findById(orderId);
        Optional<Client> foundClientOptional = clientRepository.findById(clientId);
        Optional<Copy> foundCopyOptional = copyRepository.findById(copyId);
//        Optional<Copy> foundCopyOptional1 = copyRepository.findById(copyId1);
        Assertions.assertThat(foundOrderOptional.isEmpty()).isTrue();
        Assertions.assertThat(foundClientOptional.isEmpty()).isTrue();
        Assertions.assertThat(foundCopyOptional.isEmpty()).isTrue();
//        Assertions.assertThat(foundCopyOptional1.isEmpty()).isTrue();

        copyRepository.save(copy);
//        copyRepository.save(copy1);
        clientRepository.save(c3);
        orderRepository.save(o);

        foundOrderOptional = orderRepository.findById(orderId);
        foundClientOptional = clientRepository.findById(clientId);
        foundCopyOptional = copyRepository.findById(copyId);
//        foundCopyOptional1 = copyRepository.findById(copyId1);
        Assertions.assertThat(foundOrderOptional.isPresent()).isTrue();
        Assertions.assertThat(foundClientOptional.isPresent()).isTrue();
        Assertions.assertThat(foundCopyOptional.isPresent()).isTrue();
//        Assertions.assertThat(foundCopyOptional1.isPresent()).isTrue();

        Order foundOrder = foundOrderOptional.get();
        Client foundClient = foundClientOptional.get();
        Copy foundCopy = foundCopyOptional.get();
//        Copy foundCopy1 = foundCopyOptional1.get();

        Assertions.assertThat(foundOrder.getOrderId()).isEqualTo(o.getOrderId());
        Assertions.assertThat(foundClient.getClientId()).isEqualTo(o.getClientId());
        Assertions.assertThat(foundCopy.getId()).isEqualTo(o.getCopyId());
//        Assertions.assertThat(foundCopy1.getId()).isEqualTo(o.getCopyId());



    }

}