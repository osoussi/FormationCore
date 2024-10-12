

package backend.backend.Salle;

import java.util.List;


import backend.backend.Reservation.Reservation;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "salles")
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private int capacity; // Capacité de la salle

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status; // État de la salle

    @OneToMany(mappedBy = "salle", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reservation> reservations; // Liste des réservations

    // Méthodes pour gérer les réservations
    public void reserve() {
        if (this.status == Status.DISPONIBLE) {
            this.status = Status.RESERVEE;
        } else {
            throw new IllegalStateException("La salle est déjà réservée.");
        }
    }

    public void free() {
        this.status = Status.DISPONIBLE;
    }
}
