package U5S2Ps.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "dipendenti")
@Access(AccessType.FIELD)
public class Dipendente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private UUID id;
    private String username;
    private String nome;
    private String cognome;
    private String email;

    @OneToMany
    private List<Dispositivo> dispositivi;

    public Dipendente(String username, String nome, String cognome, String email, List<Dispositivo> dispositivi) {
        this.username = username;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dispositivi = dispositivi;
    }
}
