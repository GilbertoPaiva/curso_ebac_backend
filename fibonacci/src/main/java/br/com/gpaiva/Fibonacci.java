package br.com.gpaiva;

/**
 * Classe para calcular a sequência de Fibonacci.
 */
public class Fibonacci {

    /**
     * Calcula o n-ésimo número da sequência de Fibonacci recursivamente.
     *
     * @param n a posição na sequência de Fibonacci
     * @return o n-ésimo número de Fibonacci
     * @throws IllegalArgumentException se n for negativo
     */
    public int calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O valor de n não pode ser negativo");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return calculate(n - 1) + calculate(n - 2);
    }
}