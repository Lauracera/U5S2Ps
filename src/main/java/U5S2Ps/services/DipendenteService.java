package U5S2Ps.services;

import U5S2Ps.entities.Dipendente;
import U5S2Ps.payloads.DipendenteDTO;
import U5S2Ps.repositories.DipendenteDAO;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DipendenteService {
    @Autowired
    private DipendenteDAO dipendenteDAO;

    public Page<Dipendente> getDipendente(int pageNumber, int size, String orderBy) {
        if (size > 100) size = 100;
        Pageable pageable = PageRequest.of(pageNumber, size, Sort.by(orderBy));
        return dipendenteDAO.findAll(pageable);
    }

    public Dipendente saveDipendente(DipendenteDTO payload) {
        dipendenteDAO.findByEmail(payload.email()).ifPresent(dipendente -> {
            try {
                throw new BadRequestException("L'email " + dipendente.getEmail() + " è già in uso");
            } catch (BadRequestException e) {
                throw new RuntimeException(e);
            }
        });

        Dipendente newDipendente = new Dipendente(payload.username(), payload.name(), payload.cognome(), payload.email(), payload.idDispositivo());
        return dipendenteDAO.save(newDipendente);
    }
}
