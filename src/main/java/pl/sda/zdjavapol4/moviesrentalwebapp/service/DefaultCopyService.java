package pl.sda.zdjavapol4.moviesrentalwebapp.service;

import org.springframework.stereotype.Service;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Copy;

import java.util.List;

@Service
public class DefaultCopyService implements CopyService{
    @Override
    public void saveCopy(Copy copy) {

    }

    @Override
    public List<Copy> getAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
