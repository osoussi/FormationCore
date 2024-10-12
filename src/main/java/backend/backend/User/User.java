package backend.backend.User;

import java.time.LocalDateTime;

import lombok.*;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor // Générer un constructeur par défaut
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    // Ajout des méthodes d'accès pour les propriétés
    @Setter
    @Getter
    @Column(name = "verification_code")
    private String verificationCode;

    @Setter
    @Getter
    @Column(name = "verification_expiration")
    private LocalDateTime verificationCodeExpiresAt;

    // Ajout de la méthode setEnabled
    @Setter
    private boolean enabled;

    public User(String username, String email, String encode) {
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(); // Retourne une liste vide pour l'instant; à personnaliser si nécessaire
    }

}