package backend.backend.Formation;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Long> {
    // Méthode pour trouver des formations par leur nom
    List<Formation> findByTitleContaining(String name);
}

