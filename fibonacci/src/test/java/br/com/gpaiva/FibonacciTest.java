package br.com.gpaiva;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste para a classe Fibonacci.
 */
public class FibonacciTest {

    @Test
    public void testCalculate() {
        Fibonacci fibonacci = new Fibonacci();

        assertEquals(0, fibonacci.calculate(0), "Fibonacci de 0 deve ser 0");
        assertEquals(1, fibonacci.calculate(1), "Fibonacci de 1 deve ser 1");
        assertEquals(1, fibonacci.calculate(2), "Fibonacci de 2 deve ser 1");
        assertEquals(2, fibonacci.calculate(3), "Fibonacci de 3 deve ser 2");
        assertEquals(3, fibonacci.calculate(4), "Fibonacci de 4 deve ser 3");
        assertEquals(5, fibonacci.calculate(5), "Fibonacci de 5 deve ser 5");
        assertEquals(8, fibonacci.calculate(6), "Fibonacci de 6 deve ser 8");
    }

    @Test
    public void testCalculateNegative() {
        Fibonacci fibonacci = new Fibonacci();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            fibonacci.calculate(-1);
        });

        assertEquals("O valor de n não pode ser negativo", exception.getMessage());
    }
}