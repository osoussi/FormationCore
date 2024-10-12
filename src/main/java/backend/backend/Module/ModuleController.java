package backend.backend.Module;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/modules")
public class ModuleController {

    private final ModuleService moduleService;

    // Get all modules
    @GetMapping
    public ResponseEntity<List<CourseModule>> getAllModules() {
        List<CourseModule> courseModules = moduleService.getAllModules();
        return ResponseEntity.ok(courseModules);
    }

    // Get a module by ID
    @GetMapping("/{id}")
    public ResponseEntity<CourseModule> getModuleById(@PathVariable Long id) {
        CourseModule courseModule = moduleService.getModuleById(id);
        return ResponseEntity.ok(courseModule);
    }

    // Create a new module
    @PostMapping
    public ResponseEntity<CourseModule> createModule(@RequestBody CourseModule courseModule) {
        CourseModule newCourseModule = moduleService.createModule(courseModule);
        return ResponseEntity.ok(newCourseModule);
    }

    // Update a module
    @PutMapping("/{id}")
    public ResponseEntity<CourseModule> updateModule(@PathVariable Long id, @RequestBody CourseModule courseModuleDetails) {
        CourseModule updatedCourseModule = moduleService.updateModule(id, courseModuleDetails);
        return ResponseEntity.ok(updatedCourseModule);
    }

    // Delete a module
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteModule(@PathVariable Long id) {
        moduleService.deleteModule(id);
        return ResponseEntity.noContent().build();
    }
}

