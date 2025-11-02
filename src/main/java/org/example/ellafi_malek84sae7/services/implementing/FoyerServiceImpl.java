package org.example.ellafi_malek84sae7.services.implementing;
import lombok.AllArgsConstructor;
import org.example.ellafi_malek84sae7.services.interfaces.IFoyerService;
import org.example.ellafi_malek84sae7.entities.Foyer;
import org.example.ellafi_malek84sae7.repositories.FoyerRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {
    private final FoyerRepository foyerRepository;
    @Override
    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }
    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }
    @Override
    public Foyer getFoyerById(long id) {
        return foyerRepository.findById(id).orElseThrow();
    }
    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }
    @Override
    public void deleteFoyer(long id) {
        foyerRepository.deleteById(id);
    }
}