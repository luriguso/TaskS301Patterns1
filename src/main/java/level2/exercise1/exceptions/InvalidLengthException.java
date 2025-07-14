package level2.exercise1.exceptions;

public class InvalidLengthException extends RuntimeException {
    public InvalidLengthException(String message) {
        super(message);
    }
}
