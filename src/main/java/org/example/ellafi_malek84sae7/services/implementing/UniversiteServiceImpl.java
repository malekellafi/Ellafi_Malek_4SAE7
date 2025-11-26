package org.example.ellafi_malek84sae7.services.implementing;
import lombok.AllArgsConstructor;
import org.example.ellafi_malek84sae7.entities.Foyer;
import org.example.ellafi_malek84sae7.repositories.FoyerRepository;
import org.example.ellafi_malek84sae7.services.interfaces.IUniversiteService;
import org.example.ellafi_malek84sae7.entities.Universite;
import org.example.ellafi_malek84sae7.repositories.UniversiteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {
    private final UniversiteRepository universiteRepository;
    private final FoyerRepository foyerRepository;

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
    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {

        Foyer f = foyerRepository.findById(idFoyer).get();
        Universite u = universiteRepository.findByNomUniversite(nomUniversite);

        f.setUniversite(u);
        u.setFoyer(f);
        return universiteRepository.save(u);

    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        return null;
    }


}
