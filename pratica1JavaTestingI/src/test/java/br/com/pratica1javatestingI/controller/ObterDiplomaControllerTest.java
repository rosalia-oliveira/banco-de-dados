package br.com.pratica1javatestingI.controller;

import br.com.pratica1javatestingI.model.StudentDTO;
import br.com.pratica1javatestingI.model.SubjectDTO;
import br.com.pratica1javatestingI.service.ObterDiplomaService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ObterDiplomaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Qualifier("obterDiplomaService")
    @Autowired
    private ObterDiplomaService service;

    StudentDTO studentDTOMockReturn;
    StudentDTO studentDTOMock;

    @BeforeEach
    void setUp() {
        
    }

    @Test
    void analyzeScoresMethod_showStudentData_whenAllDataIsValid() throws Exception {
        List<SubjectDTO> subjects = new ArrayList<>();
        SubjectDTO subject1 = new SubjectDTO("Matematica", 9.0);
        SubjectDTO subject2 = new SubjectDTO("Fisica", 7.0);
        subjects.add(subject1);
        subjects.add(subject2);
        studentDTOMock = new StudentDTO("Juan", subjects);
        studentDTOMockReturn = new StudentDTO("Juan",
                "O aluno Juan obteve uma média de 8. Você pode ficar melhor.",
                8.0, subjects);

        mockMvc.perform(post("/analyzeScores")
                        .contentType("application/json")
                        .content(objectMapper.writeValueAsString(studentDTOMock)))
                .andExpect(status().isCreated());

        StudentDTO studentDTO = service.analyzeScores(studentDTOMock);
        Assertions.assertEquals(studentDTO, studentDTOMockReturn);
    }

//    @Test
//    void analyzeScoresMethod_showStudentData_whenAllDataIsInValid() throws Exception {
//        List<SubjectDTO> subjects = new ArrayList<>();
//        studentDTOMock = new StudentDTO("juan", subjects);
//        mockMvc.perform(post("/analyzeScores")
//                        .contentType("application/json")
//                        .content(objectMapper.writeValueAsString(studentDTOMock)))
//                .andExpect(status().isBadRequest());
//
//        StudentDTO studentDTO = service.analyzeScores(studentDTOMock);
//    }

}