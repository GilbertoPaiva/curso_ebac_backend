package br.com.gpaiva;

/**
 * Classe Calculadora que realiza operações matemáticas básicas.
 */
public class Calculadora {

    /**
     * Adiciona dois números inteiros.
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return A soma de a e b.
     */
    int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número inteiro do primeiro.
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return A diferença entre a e b.
     */
    int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return O produto de a e b.
     */
    int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro número inteiro pelo segundo.
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return O quociente de a dividido por b.
     * @throws IllegalArgumentException se b for zero.
     */
    int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
        return a / b;
    }
}