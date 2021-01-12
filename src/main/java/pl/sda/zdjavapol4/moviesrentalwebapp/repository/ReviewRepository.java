package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Review;

import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository {
    Optional<Review> findById(Long reviewId);
}
