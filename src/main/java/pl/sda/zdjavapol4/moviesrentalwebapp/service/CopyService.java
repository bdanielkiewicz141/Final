package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import pl.sda.zdjavapol4.moviesrentalwebapp.models.Copy;

import java.util.List;

public interface CopyService {

    public void saveCopy (Copy copy);
    List<Copy> getAll();
    void delete(Long id);



}
