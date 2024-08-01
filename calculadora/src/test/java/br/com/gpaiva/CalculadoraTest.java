package br.com.gpaiva;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de testes unitários para a classe Calculadora.
 */
public class CalculadoraTest {

    @Test
    public void testAdicionar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.adicionar(2, 3));
        assertEquals(-1, calc.adicionar(-2, 1));
        assertEquals(0, calc.adicionar(0, 0));
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.subtrair(3, 2));
        assertEquals(-3, calc.subtrair(-2, 1));
        assertEquals(0, calc.subtrair(0, 0));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(-2, calc.multiplicar(-2, 1));
        assertEquals(0, calc.multiplicar(0, 5));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));
        assertEquals(-2, calc.dividir(-4, 2));
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(1, 0));
    }
}