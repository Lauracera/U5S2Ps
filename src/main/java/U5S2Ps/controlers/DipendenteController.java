package U5S2Ps.controlers;

import U5S2Ps.entities.Dipendente;
import U5S2Ps.repositories.DipendenteDAO;
import U5S2Ps.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/dipendente")
public class DipendenteController {
    @Autowired
    private DipendenteService dipendenteService;

    @GetMapping
    public Page<Dipendente> getAllDipendente(@RequestParam(defaultValue = "0")int page,
                                             @RequestParam(defaultValue = "10")int size,
                                             @RequestParam(defaultValue = "id")String orderBy){
        return this.dipendenteService.getDipendente(page, size, orderBy);
    }


    }

}
