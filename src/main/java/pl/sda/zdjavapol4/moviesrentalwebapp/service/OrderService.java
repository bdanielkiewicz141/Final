package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import org.springframework.stereotype.Service;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Order;

@Service
public interface OrderService {

    void save (Order order);

    void delete(Long orderId);

    void update (Order order);

    void getOrderByClient (Long orderId);


}
