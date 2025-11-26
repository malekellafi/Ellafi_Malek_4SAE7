package org.example.ellafi_malek84sae7.services.interfaces;
import org.example.ellafi_malek84sae7.entities.Bloc;
import java.util.List;

public interface IBlocService {
    List<Bloc> getAllBlocs();
    Bloc getBlocById(long id);
    Bloc updateBloc(Bloc bloc);
    Bloc addBloc(Bloc bloc);
    void deleteBloc(long id);

    Bloc affecterChambresABloc(List<Long> numChambre, long idBloc);
}
