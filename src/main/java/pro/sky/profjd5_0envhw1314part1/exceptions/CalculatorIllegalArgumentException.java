package pro.sky.profjd5_0envhw1314part1.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CalculatorIllegalArgumentException extends IllegalArgumentException {
    public CalculatorIllegalArgumentException(String s) {
        super(s);
    }
}
