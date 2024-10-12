package backend.backend.Salle;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalleRepository extends JpaRepository<Salle, Long> {
    // Méthode pour trouver des salles par leur statut
    List<Salle> findByStatus(Status status);
    
    // Méthode pour trouver une salle par son nom
    Salle findByName(String name);
}

