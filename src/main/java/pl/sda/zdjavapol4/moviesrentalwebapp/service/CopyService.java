package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import org.springframework.stereotype.Service;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Copy;

import java.util.List;

@Service
public interface CopyService {

    public void saveCopy (Copy copy);
    List<Copy> getAll();
    void delete(Long id);



}
