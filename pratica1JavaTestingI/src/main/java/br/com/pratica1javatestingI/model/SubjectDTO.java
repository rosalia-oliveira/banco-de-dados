package br.com.pratica1javatestingI.model;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class SubjectDTO {
    @Pattern(regexp = "[A-Z][a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ]*", message = "Student Name must start with a capital letter.")
    @Size(max=30, message = "Subject Name must have a maximum length of 30 characters." )
    String name;

    @PositiveOrZero
    @Max(value = 10)
    Double score;
}

// "[A-Z][a-zA-Zà-úÀ-Ú]*"