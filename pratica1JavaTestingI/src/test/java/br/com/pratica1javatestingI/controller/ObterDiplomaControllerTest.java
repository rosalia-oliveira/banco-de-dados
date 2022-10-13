//package br.com.pratica1javatestingI.controller;
//
//import br.com.pratica1javatestingI.model.StudentDTO;
//import br.com.pratica1javatestingI.service.ObterDiplomaService;
//import io.restassured.http.ContentType;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpStatus;
//
//import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
//import static io.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;
//
//@WebMvcTest
//class ObterDiplomaControllerTest {
//    @Autowired
//    private ObterDiplomaController obterDiplomaController;
//
//    @MockBean
//    private ObterDiplomaService obterDiplomaService;
//
////    JSONObject mock = {
////            "studentName": "Juan",
////            "subjects": [{ "name": "Matemática", "score": 0},
////    {"name": "física", "score": 7 },
////    {"name": "Química", "score": 6}]
////};
//
//@BeforeEach
//    void setUp(){
//            standaloneSetup(obterDiplomaController);
//            }
//
//@AfterEach
//    void tearDown(){
//            }
//
//@Test
//    void shouldReturnSuccess_whenAnalyzingScores_withValidData(){
//
//            Mockito.when(obterDiplomaService.analyzeScores()).thenReturn(new StudentDTO();
//
//
//            given()
//            .accept(ContentType.JSON)
//            .when()
//            .post("/analyzeScores")
//            .then()
//            .statusCode(HttpStatus.CREATED.value());
//            }
//
//@Test
//    void handleValidateException(){
//            }
//            }