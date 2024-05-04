package br.com.gpaiva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        System.out.println("Digite os nomes e sexos no formato 'nome-sexo' (ex: Pedro-H, Lucia-M):");
        String entrada = scanner.nextLine();

        String[] partes = entrada.split(",");
        for (String parte : partes) {
            String[] dados = parte.split("-");
            if (dados.length != 2) {
                System.out.println("Formato inválido: " + parte);
                continue;
            }
            String nome = dados[0].trim();
            char sexo = dados[1].trim().toUpperCase().charAt(0);

            if (sexo == 'H') {
                homens.add(nome);
            } else if (sexo == 'M') {
                mulheres.add(nome);
            } else {
                System.out.println("Sexo inválido: " + parte);
            }
        }

        System.out.println("Homens:");
        for (String homem : homens) {
            System.out.println(homem);
        }

        System.out.println("Mulheres:");
        for (String mulher : mulheres) {
            System.out.println(mulher);
        }
    }
}

