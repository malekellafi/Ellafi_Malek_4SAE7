package org.example.ellafi_malek84sae7.services.interfaces;
import org.example.ellafi_malek84sae7.entities.Foyer;
import java.util.List;
public interface IFoyerService {
    List<Foyer> getAllFoyers();
    Foyer getFoyerById(long id);
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer(Foyer foyer);
    void deleteFoyer(long id);

    Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite);
}
