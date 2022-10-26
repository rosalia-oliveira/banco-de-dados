package com.br.praticasstorage.QABugs.advisor;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class ExceptionDetails {
    private String title;
    private String message;
    private LocalDateTime timestamp;
}
