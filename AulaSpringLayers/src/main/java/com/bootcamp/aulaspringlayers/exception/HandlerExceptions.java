package com.bootcamp.aulaspringlayers.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class HandlerExceptions {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionDetails> handlerNotFoundException(NotFoundException nfExc) {
        ExceptionDetails excDetails = ExceptionDetails.builder()
                .title("Objeto nao encontrado")
                .message(nfExc.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .timeStamps(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(excDetails, HttpStatus.NOT_FOUND);
    }
}
