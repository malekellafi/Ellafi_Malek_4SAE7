package org.example.ellafi_malek84sae7.repositories;

import org.example.ellafi_malek84sae7.entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Long> {
}
