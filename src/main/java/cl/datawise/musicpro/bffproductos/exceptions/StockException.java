package cl.datawise.musicpro.bffproductos.exceptions;


import lombok.Getter;
import org.springframework.http.HttpStatus;

public class StockException extends Exception{
    @Getter private HttpStatus status;
    public StockException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
