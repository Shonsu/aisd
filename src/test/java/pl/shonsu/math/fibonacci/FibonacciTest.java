package pl.shonsu.math.fibonacci;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "1,1",
            "2,1",
            "3,2",
            "4,3",
            "5,5",
            "6,8",
            "7,13",
            "8,21"
    })
    void iterative(int n, int expected) {
        // given
        // when
        int result = Fibonacci.iterative(n);
        // then
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("fibonacciParams")
    void recursive(int n, int expected) {
        // given
        // when
        int result = Fibonacci.recursive(n);
        // then
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("fibonacciParams")
    void dynamic(int n, int expected) {
        // given
        // when
        int result = Fibonacci.dynamic(n);
        // then
        assertEquals(expected, result);
    }

    static Stream<Arguments> fibonacciParams() {
        return Stream.of(
                Arguments.arguments(0, 0),
                Arguments.arguments(1, 1),
                Arguments.arguments(2, 1),
                Arguments.arguments(3, 2),
                Arguments.arguments(4, 3),
                Arguments.arguments(5, 5),
                Arguments.arguments(6, 8),
                Arguments.arguments(7, 13),
                Arguments.arguments(8, 21),
                Arguments.arguments(9, 34)
        );
    }
}