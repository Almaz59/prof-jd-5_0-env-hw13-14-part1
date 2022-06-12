package pro.sky.profjd5_0envhw1314part1.service;

import org.springframework.stereotype.Service;
import pro.sky.profjd5_0envhw1314part1.exceptions.CalculatorIllegalArgumentException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }


    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public Integer divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new CalculatorIllegalArgumentException("Ошибка. Нельзя делить на ноль");
        }
        return num1 / num2;
    }

}
