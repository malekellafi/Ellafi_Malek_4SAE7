package org.example.ellafi_malek84sae7.services.implementing;
import lombok.AllArgsConstructor;
import org.example.ellafi_malek84sae7.entities.*;
import org.example.ellafi_malek84sae7.repositories.FoyerRepository;
import org.example.ellafi_malek84sae7.repositories.UniversiteRepository;
import org.example.ellafi_malek84sae7.services.interfaces.IChmbreService;
import org.example.ellafi_malek84sae7.repositories.ChambreRepository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChmbreService {
    private final ChambreRepository chambreRepository;
    private final UniversiteRepository universiteRepository;
    private final FoyerRepository foyerRepository;

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public Chambre getChambreById(Long id) {
        return chambreRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Chambre> getChambresParNomUniversite(String nomUniversite) {
        Universite universite = universiteRepository.findByNomUniversite(nomUniversite);
        if (universite == null || universite.getFoyer() == null) {
            return null;
        }
        Foyer foyer = universite.getFoyer();
        if (foyer.getBlocs() == null) {
            return null;
        }
        List<Chambre> result = new ArrayList<>();
        for (Bloc bloc : foyer.getBlocs()) {
            result.addAll(bloc.getChambres());
        }
        return result;
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) {

        return chambreRepository.findByBlocIdBlocAndTypeC(idBloc, typeC);
    }
    @Override
    public List<Chambre> getChambresNonReserveParNomFoyerEtTypeChambre(String nomFoyer, TypeChambre type) {

        Foyer f = foyerRepository.findFoyerByNomFoyer(nomFoyer);


        List<Chambre> res = new ArrayList<>();

        for (Bloc b : f.getBlocs()) {
            for (Chambre ch : b.getChambres()) {

                boolean reservationValideCetteAnnee = ch.getReservations() != null
                        && ch.getReservations().stream()
                        .anyMatch(r -> r.isEstValide()
                                && (r.getAnneeUniversitaire() != null));

                if (!reservationValideCetteAnnee) {
                    res.add(ch);
                }
            }
        }
        return res;
    }

    @Override
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type) {
        return List.of();
    }
}
