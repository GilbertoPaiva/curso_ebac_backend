package br.com.gpaiva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> pessoas = new ArrayList<>();

        System.out.println("Digite os nomes e sexos no formato nome-sexo (sexo sendo M ou F). Digite 'sair' para terminar:");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("sair")) {
                break;
            }


            if (input.matches("^[A-Za-z]+-[MmFf]$")) {
                pessoas.add(input);
            } else {
                System.out.println("Formato inválido, digite novamente.");
            }
        }

        List<String> mulheres = filtrarMulheres(pessoas);

        System.out.println("Lista de todas as pessoas:");
        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("Lista de mulheres:");
        for (String mulher : mulheres) {
            System.out.println(mulher);
        }
    }

    public static List<String> filtrarMulheres(List<String> pessoas) {
        return pessoas.stream()
                .filter(pessoa -> pessoa.toLowerCase().endsWith("-f"))
                .toList();
    }
}
