package pro.sky.profjd5_0envhw1314part1.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String welcomeToCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Integer num1, Integer num2) {
        String error = error(num1, num2);
        if (error != null) {
            return error;
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }


    public String minus(Integer num1, Integer num2) {
        String error = error(num1, num2);
        if (error != null) {
            return error;
        }
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(Integer num1, Integer num2) {
        String error = error(num1, num2);
        if (error != null) {
            return error;
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide(Integer num1, Integer num2) {
        String error = error(num1, num2);
        if (error != null) {
            return error;
        }else if (num2 == 0) {
            return "Ошибка. Нельзя делить на ноль";
        }
            return num1 + " / " + num2 + " = " + (num1 / num2);
    }

    public String error(Integer num1, Integer num2) {
        if (num1 == null && num2 == null) {
            return "Ошибка. Вы не ввели значение num1 и num2";
        }else if (num1 == null) {
            return "Ошибка. Вы не ввели значение num1";
        } else if (num2 == null) {
            return "Ошибка. Вы не ввели значение num2";
        }
        return null;
    }

}
