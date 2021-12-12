package edu.labs.lab3.task1;

public class UserValidationException extends RuntimeException {
    private ErrorCode errorCode;

    public UserValidationException(final String message, final ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
