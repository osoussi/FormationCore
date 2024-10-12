package backend.backend.Salle;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/salles")
public class SalleController {

    private final SalleService salleService;

    // Get all rooms
    @GetMapping
    public ResponseEntity<List<Salle>> getAllSalles() {
        List<Salle> salles = salleService.getAllSalles();
        return ResponseEntity.ok(salles);
    }

    // Get a room by ID
    @GetMapping("/{id}")
    public ResponseEntity<Salle> getSalleById(@PathVariable Long id) {
        Salle salle = salleService.getSalleById(id);
        return ResponseEntity.ok(salle);
    }

    // Create a new room
    @PostMapping
    public ResponseEntity<Salle> createSalle(@RequestBody Salle salle) {
        Salle newSalle = salleService.createSalle(salle);
        return ResponseEntity.ok(newSalle);
    }

    // Update a room
    @PutMapping("/{id}")
    public ResponseEntity<Salle> updateSalle(@PathVariable Long id, @RequestBody Salle salleDetails) {
        Salle updatedSalle = salleService.updateSalle(id, salleDetails);
        return ResponseEntity.ok(updatedSalle);
    }

    // Delete a room
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSalle(@PathVariable Long id) {
        salleService.deleteSalle(id);
        return ResponseEntity.noContent().build();
    }
}

