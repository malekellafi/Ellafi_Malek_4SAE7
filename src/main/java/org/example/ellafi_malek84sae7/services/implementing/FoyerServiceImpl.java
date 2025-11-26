package org.example.ellafi_malek84sae7.services.implementing;
import lombok.AllArgsConstructor;
import org.example.ellafi_malek84sae7.entities.Bloc;
import org.example.ellafi_malek84sae7.entities.Universite;
import org.example.ellafi_malek84sae7.repositories.BlocRepository;
import org.example.ellafi_malek84sae7.repositories.UniversiteRepository;
import org.example.ellafi_malek84sae7.services.interfaces.IFoyerService;
import org.example.ellafi_malek84sae7.entities.Foyer;
import org.example.ellafi_malek84sae7.repositories.FoyerRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {
    private final FoyerRepository foyerRepository;
    private final UniversiteRepository universiteRepository;
    private final BlocRepository blocRepository;

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
    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).get();

        List<Bloc> blocs = blocRepository.findAll();
        if (blocs != null) {
            for (Bloc b : blocs) {
                b.setFoyer(foyer);
                blocRepository.save(b);
            }
        }

        foyer.setUniversite(universite);
        Foyer savedFoyer = foyerRepository.save(foyer);

        universite.setFoyer(savedFoyer);
        universiteRepository.save(universite);

        return savedFoyer;
    }
}