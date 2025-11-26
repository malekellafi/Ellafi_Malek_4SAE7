package org.example.ellafi_malek84sae7.services.implementing;
import lombok.AllArgsConstructor;
import org.example.ellafi_malek84sae7.entities.Chambre;
import org.example.ellafi_malek84sae7.repositories.ChambreRepository;
import org.example.ellafi_malek84sae7.services.interfaces.IBlocService;
import org.example.ellafi_malek84sae7.entities.Bloc;
import org.example.ellafi_malek84sae7.repositories.BlocRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor

public class BlocServiceImpl implements IBlocService {
    private final BlocRepository blocRepository;
    private final ChambreRepository chambreRepository;


    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc getBlocById(long id) {
        return blocRepository.findById(id).orElseThrow();
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
    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc){



        Bloc b = blocRepository.findById(idBloc).get();

        List<Chambre> chambres = new ArrayList<>();
        for (Long i : numChambre ){
            Chambre c = chambreRepository.findByNumeroChambre(i);
            if(c!=null){
                c.setBloc(b);
                chambres.add(c);
            }

        }



        return blocRepository.save(b);

    }




}
