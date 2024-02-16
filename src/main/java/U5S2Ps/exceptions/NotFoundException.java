package U5S2Ps.exceptions;

import java.util.UUID;

public class NotFoundException extends RuntimeException{
    public NotFoundException(UUID id){
        super("L'utente con id " + id + " non è stato trovato");
    }

}
