package pl.altkom.springboot.lab04.calculator.controller;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class CalculatorControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void add() {

        //given
        final Float a = 5.0f;
        final Float b = 6.0f;
        final String url = String.format("http://localhost:%d/app/calculator/add/a/%d/b/%d", port, 5, 6);

        //when
        final ResponseEntity<Float> responseEntity = restTemplate.getForEntity(url, Float.class);

        //then
        assertEquals(11f, responseEntity.getBody());
    }

}