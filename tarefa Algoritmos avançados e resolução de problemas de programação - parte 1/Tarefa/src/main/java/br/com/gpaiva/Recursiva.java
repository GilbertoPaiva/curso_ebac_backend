package br.com.gpaiva;

public class Recursiva {
    public static void main(String[] args) {
        Long number = 120L;
        Long result = fatorial(number);

        System.out.println("Fatorial de " + number + " é " + result);
    }

    public static Long fatorial(Long number) {
        if (number == 0) {
            return 1L;
        }

        return number * fatorial(number - 1);
    }
}