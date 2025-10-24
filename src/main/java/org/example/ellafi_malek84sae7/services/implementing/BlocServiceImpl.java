package org.example.ellafi_malek84sae7.services.implementing;
import lombok.AllArgsConstructor;
import org.example.ellafi_malek84sae7.services.interfaces.IBlocService;
import org.example.ellafi_malek84sae7.entities.Bloc;
import org.example.ellafi_malek84sae7.repositories.BlocRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor

public class BlocServiceImpl implements IBlocService {
    private final BlocRepository blocRepository;
    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc getBlocById(long id) {
        return blocRepository.findById(id).orElse(null);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);

    }





}
