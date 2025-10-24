package org.example.ellafi_malek84sae7.services.implementing;
import lombok.AllArgsConstructor;
import org.example.ellafi_malek84sae7.services.interfaces.IChmbreService;
import org.example.ellafi_malek84sae7.entities.Chambre;
import org.example.ellafi_malek84sae7.repositories.ChambreRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChmbreService {
    private ChambreRepository chambreRepository;
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
        return chambreRepository.findById(id).orElse(null);
    }
}
