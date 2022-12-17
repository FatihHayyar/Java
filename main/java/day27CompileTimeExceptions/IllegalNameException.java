package day27CompileTimeExceptions;

public class IllegalNameException extends RuntimeException {
public IllegalNameException(String message) {
    super(message);
}
}
