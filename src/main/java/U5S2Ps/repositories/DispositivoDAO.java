package U5S2Ps.repositories;

import U5S2Ps.entities.Dipendente;
import U5S2Ps.entities.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface DispositivoDAO extends JpaRepository<Dipendente, UUID> {

}
