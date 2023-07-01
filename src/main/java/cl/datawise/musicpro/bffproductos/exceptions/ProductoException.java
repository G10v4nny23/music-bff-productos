package cl.datawise.musicpro.bffproductos.exceptions;


import lombok.Getter;
import org.springframework.http.HttpStatus;

public class ProductoException extends Exception {
    @Getter private HttpStatus status;
    public ProductoException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
