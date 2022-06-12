package pro.sky.profjd5_0envhw1314part1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.profjd5_0envhw1314part1.service.CalculatorService;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcomeToCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false, name = "num1") Integer num1,
                       @RequestParam(required = false, name = "num2") Integer num2) {
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }


    @GetMapping("/minus")
    public String minus(@RequestParam(required = false, name = "num1") Integer num1,
                        @RequestParam(required = false, name = "num2") Integer num2) {
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false, name = "num1") Integer num1,
                           @RequestParam(required = false, name = "num2") Integer num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = false, name = "num1") Integer num1,
                         @RequestParam(required = false, name = "num2") Integer num2) {
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }

}

