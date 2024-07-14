package br.com.gpaiva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChange {
    public static void main(String[] args) {
        int amount = 18;
        int[] coins = {5, 2, 1};

        List<Integer> result = getMinimumCoins(amount, coins);

        System.out.println("Moedas necessárias: " + result.size());
        System.out.println("Detalhamento: " + result);
    }

    public static List<Integer> getMinimumCoins(int amount, int[] coins) {
        List<Integer> result = new ArrayList<>();

        // Ordenar as moedas em ordem decrescente
        Arrays.sort(coins);
        // Testa da maior moeda para a menor
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                result.add(coins[i]);
            }
        }

        return result;
    }
}
