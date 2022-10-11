package br.com.pratica1javatestingI.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class StudentDTO {
    @NotBlank(message = "The student's name cannot be empty.")
    @Pattern(regexp = "[A-Z][a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ]*", message = "The student's name must begin with a capital letter.")
    @Size(max=50, message = "The student's name length cannot exceed 50 characters." )
    String studentName;

    String message;

    Double averageScore;

    @Size(min=1, message = "The list cannot be empty.")
    @Valid
    List<SubjectDTO> subjects;
}
