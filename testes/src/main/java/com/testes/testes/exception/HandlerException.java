package com.testes.testes.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class HandlerException extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders httpHeaders,
            HttpStatus httpStatus,
            WebRequest request) {
        List<FieldError> errors = ex.getBindingResult().getFieldErrors();
        return new ResponseEntity<>(
                ExceptionDetails.builder()
                        .title("Invalid params.")
                        .message("Invalid Fields.")
                        .fields(errors.stream().map(FieldError::getField).collect(Collectors.joining(";")))
                        .fieldsMessage(errors.stream().map(FieldError::getDefaultMessage).collect(Collectors.joining(";")))
                        .timestamp(LocalDateTime.now()).build(),
                httpStatus);
    }
}
