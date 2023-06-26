package pl.altkom.springboot.lab04.calculator.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorServiceTest {

    @InjectMocks
    private CalculatorService calculatorService;

    @Test
    void should_add_two_values() {

        //given
        final Float a = 5f;
        final Float b = 6f;

        //when
        final Float result = calculatorService.add(a, b);

        //then
        assertEquals(11f, result);
    }
}