package U5S2Ps.exeptions;

import lombok.Getter;
import org.springframework.validation.ObjectError;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.util.List;

@Getter
public class BadRequestExeption extends RuntimeException{
    private List<ObjectError> errorList;

    public BadRequestExeption(String message){
        super(message);
    }

    public BadRequestExeption(List<ObjectError>errorList){
        super("Errori nel payload");
        this.errorList = errorList;
    }
}
