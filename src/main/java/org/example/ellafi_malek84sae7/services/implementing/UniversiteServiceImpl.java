package org.example.ellafi_malek84sae7.services.implementing;
import lombok.AllArgsConstructor;
import org.example.ellafi_malek84sae7.services.interfaces.IUniversiteService;
import org.example.ellafi_malek84sae7.entities.Universite;
import org.example.ellafi_malek84sae7.repositories.UniversiteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {
    private final UniversiteRepository universiteRepository;
    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
    @Override
    public Universite getUniversiteById(Long id) {
        return universiteRepository.findById(id).orElseThrow();
    }
    @Override
    public void deleteUniversite(Long id) {
        universiteRepository.deleteById(id);
    }
}
