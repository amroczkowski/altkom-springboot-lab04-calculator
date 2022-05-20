package pl.altkom.springboot.lab04.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pl.altkom.springboot.lab04.calculator.service.CalculatorService;

@RequiredArgsConstructor
@RequestMapping("/calculator")
@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping("/add/a/{a}/b/{b}")
    public Float add(@PathVariable("a") final Float a, @PathVariable("b") final Float b) {
        return calculatorService.add(a, b);
    }

    @GetMapping("/subtract/a/{a}/b/{b}")
    public Float subtract(@PathVariable("a") final Float a, @PathVariable("b") final Float b) {
        return calculatorService.subtract(a, b);
    }

    @GetMapping("/multiply/a/{a}/b/{b}")
    public Float multiply(@PathVariable("a") final Float a, @PathVariable("b") final Float b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/divide/a/{a}/b/{b}")
    public Float divide(@PathVariable("a") final Float a, @PathVariable("b") final Float b) {
        return calculatorService.divide(a, b);
    }
}
