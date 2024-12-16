package com.github.mily88.forohub.infra.exceptions;

public class TokenServiceException extends RuntimeException {
    public TokenServiceException(String message) {
        super(message);
    }
    public TokenServiceException(String message, Throwable cause) { super(message, cause); }
}
