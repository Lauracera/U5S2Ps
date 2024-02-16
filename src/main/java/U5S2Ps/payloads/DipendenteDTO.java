package U5S2Ps.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record DipendenteDTO(
        @NotEmpty(message = "username obbligatorio")
        @Size(min = 3, max = 10, message = "I caratteri devono essere compresi tra 3 e 10")
        String username,
        @NotEmpty(message = "nome obbligatorio")
        @Size(min = 3, max = 10, message = "I caratteri del nome devono essere compresi tra 3 e 10")
        String name,
        @NotEmpty(message = "nome obbligatorio")
        @Size(min = 3, max = 15, message = "I caratteri del cognome devono essere compresi tra 3 e 15")
        String cognome,
        @NotEmpty(message = "email obbligatoria")
        @Size(min = 3, max = 15, message = "I caratteri devono essere compresi tra 3 e 15")
        String email,
        @NotEmpty(message = "Id dispositivo obbligatorio")
        @Size(min = 3, max = 15, message = "I caratteri devono essere compresi tra 3 e 15")
        String idDisposiivo) {
}
