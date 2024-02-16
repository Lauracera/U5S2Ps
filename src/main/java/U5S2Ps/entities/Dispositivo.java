package U5S2Ps.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "dispositivi")
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private UUID id;
    private String tipo;
    private String stato;

    @ManyToOne
    private Dipendente dipendente;

    public Dispositivo(String tipo, String stato, Dipendente dipendente) {
        this.tipo = tipo;
        this.stato = stato;
        this.dipendente = dipendente;
    }
}
