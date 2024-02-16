package U5S2Ps.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record DispositivoDTO(
        @NotEmpty(message = "Il tipo di dipositivo è obbligatorio!")
        @Size(min = 3, max = 20, message = "I caratteri devono essere compresi tra 3 e 20")
        String tipo,
        @NotEmpty(message = "Lo stato del dispositivo è obbligatorio!")
        @Size(min = 8, max = 12, message = "I caratteri devono essere compresi tra 8 e 12")
        String stato
) {
}
