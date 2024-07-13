package br.com.gpaiva;

public class FactorialTopDown {
    private static long[] memo;

    public static void main(String[] args){
        int number = 10;
        memo = new long[number + 1];
        long result = fatorial(number);
        System.out.println("Fatorial de " + number + " é " + result);
    }

    public static long fatorial(int number) {
        if (number == 0) {
            return 1L;
        }

        if (memo[number] != 0) {
            return memo[number];
        }

        memo[number] = number * fatorial(number - 1);
        return memo[number];
    }
}
