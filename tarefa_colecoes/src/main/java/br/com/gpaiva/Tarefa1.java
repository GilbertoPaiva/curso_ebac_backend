package br.com.gpaiva;

import java.util.Arrays;
import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os nome separados por vírgula:");
        String entrada = sc.nextLine();

        String[] nomes = entrada.split(",");
        for (int i = 0; i < nomes.length; i++){
            nomes[i] = nomes[i].trim();
        }

        Arrays.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}