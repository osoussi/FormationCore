package backend.backend.Salle;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SalleService {

    private final SalleRepository salleRepository;

    // Méthode pour obtenir toutes les salles
    public List<Salle> getAllSalles() {
        return salleRepository.findAll();
    }

    // Méthode pour obtenir une salle par ID
    public Salle getSalleById(Long id) {
        return salleRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Salle not found"));
    }

    // Méthode pour créer une nouvelle salle
    public Salle createSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    // Méthode pour mettre à jour une salle
    public Salle updateSalle(Long id, Salle salleDetails) {
        Salle salle = salleRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Salle not found"));

        salle.setName(salleDetails.getName());
        salle.setCapacity(salleDetails.getCapacity());
        // Ajoute d'autres propriétés si nécessaire

        return salleRepository.save(salle);
    }

    // Méthode pour supprimer une salle
    public void deleteSalle(Long id) {
        salleRepository.deleteById(id);
    }
}
