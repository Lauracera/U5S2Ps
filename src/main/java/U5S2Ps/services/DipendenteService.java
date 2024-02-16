package U5S2Ps.services;

import U5S2Ps.entities.Dipendente;
import U5S2Ps.repositories.DipendenteDAO;
import lombok.extern.slf4j.Slf4j;
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

    public Page<Dipendente> getDipendente(int pageNumber, int size, String orderBy){
        if(size > 100) size = 100;
        Pageable pageable = PageRequest.of(pageNumber, size, Sort.by(orderBy));
        return dipendenteDAO.findAll(pageable);
    }
}
