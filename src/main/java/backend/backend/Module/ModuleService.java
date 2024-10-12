package backend.backend.Module;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ModuleService {

    private final ModuleRepository moduleRepository;

     // Méthode pour obtenir tous les modules
     public List<CourseModule> getAllModules() {
        return moduleRepository.findAll();
    }

    public List<CourseModule> getModulesByFormationId(Long formationId) {
        return moduleRepository.findByFormationId(formationId);
    }

    public CourseModule getModuleById(Long id) {
        return moduleRepository.findById(id).orElse(null);
    }

    public CourseModule createModule(CourseModule courseModule) {
        return moduleRepository.save(courseModule);
    }

    public CourseModule updateModule(Long id, CourseModule courseModule) {
        courseModule.setId(id);
        return moduleRepository.save(courseModule);
    }

    public void deleteModule(Long id) {
        moduleRepository.deleteById(id);
    }
}

