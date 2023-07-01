package cl.datawise.musicpro.bffproductos.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class CategoriaException extends Exception{
    @Getter private HttpStatus status;
    public CategoriaException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
