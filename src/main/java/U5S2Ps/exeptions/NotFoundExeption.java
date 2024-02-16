package U5S2Ps.exeptions;

import java.util.UUID;

public class NotFoundExeption extends RuntimeException{
    public NotFoundExeption(UUID id){
        super("L'utente con id " + id + " non è stato trovato");
    }

}
