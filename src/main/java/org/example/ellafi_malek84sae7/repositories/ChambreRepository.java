package org.example.ellafi_malek84sae7.repositories;

import org.example.ellafi_malek84sae7.entities.Chambre;
import org.example.ellafi_malek84sae7.entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    Chambre findByNumeroChambre(Long i);

    List<Chambre> findByBlocIdBlocAndTypeC(long idBloc, TypeChambre typeC);
}
