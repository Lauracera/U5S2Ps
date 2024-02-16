package U5S2Ps.controlers;

import U5S2Ps.entities.Dipendente;
import U5S2Ps.entities.Dispositivo;
import U5S2Ps.repositories.DispositivoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dispositivo")
public class DispositivoController {

    @Autowired
    private DispositivoDAO dispositivoDAO;

    @GetMapping
    public Page<Dispositivo> getAllDipendente(@RequestParam(defaultValue = "0")int page,
                                              @RequestParam(defaultValue = "10")int size,
                                              @RequestParam(defaultValue = "id")String orderBy){
        return this.dispositivoDAO.existsById();
    }
}
