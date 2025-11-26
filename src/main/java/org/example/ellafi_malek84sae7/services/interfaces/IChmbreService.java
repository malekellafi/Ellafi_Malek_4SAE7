package org.example.ellafi_malek84sae7.services.interfaces;
import org.example.ellafi_malek84sae7.entities.Chambre;
import org.example.ellafi_malek84sae7.entities.TypeChambre;

import java.util.List;
public interface IChmbreService {
    List<Chambre> getAllChambres();
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(Long id);
    Chambre getChambreById(Long id);

    List<Chambre> getChambresParNomUniversite(String nomUniversite);

    List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC);

    List<Chambre> getChambresNonReserveParNomFoyerEtTypeChambre(String nomFoyer, TypeChambre type);

    List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type);
}
