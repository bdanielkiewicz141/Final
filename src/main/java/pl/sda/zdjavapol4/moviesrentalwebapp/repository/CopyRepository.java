package pl.sda.zdjavapol4.moviesrentalwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Copy;

import java.util.Optional;

@Repository
public interface CopyRepository extends JpaRepository {
    Optional<Copy> findById(long copyId);




}
