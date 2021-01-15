package pl.sda.zdjavapol4.moviesrentalwebapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Order;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository {

    Optional<Order> findById(Long orderId);
}
