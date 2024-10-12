package backend.backend.Module;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleRepository extends JpaRepository<CourseModule, Long> {
    // Méthode pour trouver des modules par leur formation
    List<CourseModule> findByFormationId(Long formationId);
    
    // Méthode pour trouver un module par son nom
    CourseModule findByName(String name);
}
