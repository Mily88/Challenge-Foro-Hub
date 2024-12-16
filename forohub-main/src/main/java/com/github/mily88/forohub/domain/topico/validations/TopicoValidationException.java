package com.github.mily88.forohub.domain.topico.validations;

import com.github.mily88.forohub.domain.topico.Topico;
import lombok.Getter;
import org.springframework.validation.FieldError;

@Getter
public class TopicoValidationException extends RuntimeException {

    private final FieldError fieldError;

    public TopicoValidationException(String field, String message) {
        super(message);
        this.fieldError = new FieldError(Topico.class.getName(),field,message);
    }

}
