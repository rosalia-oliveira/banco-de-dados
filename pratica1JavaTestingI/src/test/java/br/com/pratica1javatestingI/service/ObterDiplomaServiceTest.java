package br.com.pratica1javatestingI.service;

import br.com.pratica1javatestingI.model.StudentDTO;
import br.com.pratica1javatestingI.model.SubjectDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ObterDiplomaServiceTest {

    @Autowired
    ObterDiplomaService obterDiplomaService;


    @TestConfiguration
    public class ServiceConfiguration {
        @Bean
        public ObterDiplomaService instanceObterDiplomaService() {
            return new ObterDiplomaService();
        }
    }

    StudentDTO studentDTOMockReturn;
    StudentDTO studentDTOMock;

    @BeforeEach
    void setup() {
        List<SubjectDTO> subjects = new ArrayList<>();
        SubjectDTO subject1 = new SubjectDTO("Matematica", 9.0);
        SubjectDTO subject2 = new SubjectDTO("Fisica", 7.0);
        subjects.add(subject1);
        subjects.add(subject2);
        studentDTOMock = new StudentDTO("Juan", subjects);
        studentDTOMockReturn = new StudentDTO("Juan", "O aluno Juan obteve uma média de 8,00. Aprovado.", 8.0, subjects);
    }

    @Test
    void nameTest() {
        Mockito.when(obterDiplomaService.analyzeScores(studentDTOMock)).thenReturn(studentDTOMock);
        StudentDTO expected = obterDiplomaService.analyzeScores(studentDTOMock);

        Assertions.assertEquals(expected, studentDTOMockReturn);

    }

}