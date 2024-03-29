package U5S2Ps.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
 @AllArgsConstructor
public class ErrorsPayload {
    private String message;
    private LocalDateTime timestamp;
}
