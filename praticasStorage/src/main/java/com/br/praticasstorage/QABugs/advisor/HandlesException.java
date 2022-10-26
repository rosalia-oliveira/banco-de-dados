package com.br.praticasstorage.QABugs.advisor;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@ControllerAdvice
public class HandlesException {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ExceptionDetails> handleIllegalArgumentException(IllegalArgumentException illegalExc) {
        return new ResponseEntity<>(
                ExceptionDetails.builder()
                        .title("Illegal or Inappropriate Argument.")
                        .message(illegalExc.getMessage())
                        .timestamp(LocalDateTime.now())
                        .build(),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<ExceptionDetails> handleNoSuchElementException(NoSuchElementException noSuchExc) {
        return new ResponseEntity<>(
                ExceptionDetails.builder()
                        .title("No Such Element.")
                        .message("Your search returned no results!")
                        .timestamp(LocalDateTime.now())
                        .build(),
                HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ExceptionDetails> handleNoSuchElementException(DataIntegrityViolationException dataIntegExc) {
        return new ResponseEntity<>(
                ExceptionDetails.builder()
                        .title("Body and Fields cannot be null.")
                        .message("Property references a null or transient value.")
                        .timestamp(LocalDateTime.now())
                        .build(),
                HttpStatus.BAD_REQUEST);
    }
}
