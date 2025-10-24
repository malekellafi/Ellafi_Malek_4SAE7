package org.example.ellafi_malek84sae7.services.interfaces;
import org.example.ellafi_malek84sae7.entities.Chambre;
import java.util.List;
public interface IChmbreService {
    List<Chambre> getAllChambres();
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(Long id);
    Chambre getChambreById(Long id);

}
