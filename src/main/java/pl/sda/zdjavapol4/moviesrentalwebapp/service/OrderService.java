package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import pl.sda.zdjavapol4.moviesrentalwebapp.models.Order;

public interface OrderService {

    void save (Order order);

    void delete(Long orderId);

    void update (Order order);

    void getOrderByClient (Long orderId);


}
