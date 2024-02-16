package U5S2Ps.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.List;

@RestControllerAdvice
public class ExeptionsHandler {
    @ExceptionHandler(BadRequestExeption.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorsPayload handleBadRequest(BadRequestExeption ex){
        if(ex.getErrorList() != null) {
            List<String> errorsList = ex.getErrorList().stream().map(objectError -> objectError.getDefaultMessage()).toList();
            return new ErrorsPayload(ex.getMessage(), LocalDateTime.now());
        }
        return null;
    }

    @ExceptionHandler(BadRequestExeption.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorsPayload handleNotFound(NotFoundExeption ex){
        return new ErrorsPayload(ex.getMessage(), LocalDateTime.now());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorsPayload handleGenericErrors(Exception ex){
        ex.printStackTrace();
        return new ErrorsPayload("Problema del server, verrà risolto a breve", LocalDateTime.now());
    }
}
