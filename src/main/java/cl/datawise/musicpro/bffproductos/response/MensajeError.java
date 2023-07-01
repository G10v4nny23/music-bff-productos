package cl.datawise.musicpro.bffproductos.response;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class MensajeError {
    private HttpStatus status;
    private String message;
}