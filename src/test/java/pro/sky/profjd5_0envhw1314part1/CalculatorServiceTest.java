package pro.sky.profjd5_0envhw1314part1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.profjd5_0envhw1314part1.service.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.apache.tomcat.util.json.JSONParserConstants.ZERO;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.profjd5_0envhw1314part1.CalculatorServiceTestConstants.*;

public class CalculatorServiceTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamForTests() {
        return Stream.of(
                Arguments.of(CORRECT_NUMBER_1, CORRECT_NUMBER_2),
                Arguments.of(CORRECT_NUMBER_3, CORRECT_NUMBER_4),
                Arguments.of(CORRECT_NUMBER_1, CORRECT_NUMBER_4),
                Arguments.of(CORRECT_NUMBER_2, CORRECT_NUMBER_3),
                Arguments.of(CORRECT_NUMBER_1, CORRECT_NUMBER_3),
                Arguments.of(CORRECT_NUMBER_2, CORRECT_NUMBER_4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamForTests")
    public void shouldReturnCorrectPlus(Integer num1, Integer num2){
        Integer expected = out.plus(num1, num2);
        Integer actual = num1 + num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamForTests")
    public void shouldReturnCorrectMinus(Integer num1, Integer num2) {
        Integer expected = out.minus(num1, num2);
        Integer actual = num1 - num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamForTests")
    public void shouldReturnCorrectMultiply(Integer num1, Integer num2) {
        Integer expected = out.multiply(num1, num2);
        Integer actual = num1 * num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamForTests")
    public void shouldReturnCorrectDivide(Integer num1, Integer num2) {
        Integer expected = out.divide(num1, num2);
        Integer actual = num1 / num2;
        assertEquals(expected, actual);
    }



    @Test
    public void shouldReturnPlusTwoNumbersFirst() {
        Integer expected = out.plus(CORRECT_NUMBER_1, CORRECT_NUMBER_2);
        Integer actual = CORRECT_NUMBER_1 + CORRECT_NUMBER_2;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnPlusTwoNumbersSecond() {
        Integer expected = out.plus(CORRECT_NUMBER_3, CORRECT_NUMBER_4);
        Integer actual = CORRECT_NUMBER_3 + CORRECT_NUMBER_4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinusTwoNumbersFirst() {
        Integer expected = out.minus(CORRECT_NUMBER_1, CORRECT_NUMBER_2);
        Integer actual = CORRECT_NUMBER_1 - CORRECT_NUMBER_2;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinusTwoNumbersSecond() {
        Integer expected = out.minus(CORRECT_NUMBER_3, CORRECT_NUMBER_4);
        Integer actual = CORRECT_NUMBER_3 - CORRECT_NUMBER_4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMultiplyTwoNumbersFirst() {
        Integer expected = out.multiply(CORRECT_NUMBER_1, CORRECT_NUMBER_2);
        Integer actual = CORRECT_NUMBER_1 * CORRECT_NUMBER_2;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMultiplyTwoNumbersSecond() {
        Integer expected = out.multiply(CORRECT_NUMBER_3, CORRECT_NUMBER_4);
        Integer actual = CORRECT_NUMBER_3 * CORRECT_NUMBER_4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnDivideTwoNumbersFirst() {
        Integer expected = out.divide(CORRECT_NUMBER_1, CORRECT_NUMBER_2);
        Integer actual = CORRECT_NUMBER_1 / CORRECT_NUMBER_2;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnDivideTwoNumbersSecond() {
        Integer expected = out.divide(CORRECT_NUMBER_3, CORRECT_NUMBER_4);
        Integer actual = CORRECT_NUMBER_3 / CORRECT_NUMBER_4;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldReturnDivideTwoNumbersZero() {
        assertThrows(IllegalArgumentException.class, (() -> out.divide(CORRECT_NUMBER_1, CORRECT_NUMBER_5)));
    }

}
