package br.com.gpaiva;

public class FatorialBottomUp {
    public static void main(String[]args){
        int numbber = 10;
        long result = fatorial(numbber);
        System.out.println("Fatorial de " + numbber + " é " + result);
    }

    public static long fatorial(int n){
        if (n <= 1){
            return 1;
        }
        long[] tabela = new long[n + 1];
        tabela[0] = 1;
        tabela[1] = 1;
        for(int i = 2; i <= n; i++){
            tabela[i] = i * tabela[i - 1];
        }
        return tabela[n];
    }
}
