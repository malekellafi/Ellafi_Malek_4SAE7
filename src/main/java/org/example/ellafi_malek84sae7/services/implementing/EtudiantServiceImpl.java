package org.example.ellafi_malek84sae7.services.implementing;
import lombok.AllArgsConstructor;
import org.example.ellafi_malek84sae7.services.interfaces.IEtudiantService;
import org.example.ellafi_malek84sae7.entities.Etudiant;
import org.example.ellafi_malek84sae7.repositories.EtudiantRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {
    private final EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getEtudiantById(Long id) {
        return etudiantRepository.findById(id).orElseThrow();
    }
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }


}

