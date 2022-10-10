package com.testes.testes.exception;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class ExceptionDetails {
    private String title;
    private String message;
    private String fields;
    private String fieldsMessage;
    private LocalDateTime timestamp;
}
