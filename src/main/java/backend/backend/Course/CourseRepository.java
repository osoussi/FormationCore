package backend.backend.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    // Méthode pour trouver des cours par leur module
    List<Course> findByModuleId(Long moduleId);
    
    // Méthode pour trouver un cours par son nom
    Course findByTitle(String name);
}

