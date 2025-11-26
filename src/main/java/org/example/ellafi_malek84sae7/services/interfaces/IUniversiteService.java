package org.example.ellafi_malek84sae7.services.interfaces;
import org.example.ellafi_malek84sae7.entities.Universite;
import java.util.List;
public interface IUniversiteService {
    List<Universite> getAllUniversites();
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    Universite getUniversiteById(Long id);
    void deleteUniversite(Long id);

    Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite);

    Universite desaffecterFoyerAUniversite(long idUniversite);
}
