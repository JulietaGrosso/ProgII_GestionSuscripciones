package model.exceptions;

public class PinInvalidoException extends RuntimeException {
    public PinInvalidoException(String message) {
        super(message);
    }
}
