package pl.altkom.springboot.lab04.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Float add(final Float a, final Float b) {
        return a + b;
    }

    public Float subtract(final Float a, final Float b) {
        return a - b;
    }

    public Float multiply(final Float a, final Float b) {
        return a * b;
    }

    public Float divide(final Float a, final Float b) {
        return a / b;
    }
}
