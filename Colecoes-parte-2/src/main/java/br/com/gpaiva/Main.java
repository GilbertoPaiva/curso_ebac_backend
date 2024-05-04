package br.com.gpaiva;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Map<String, List<String>> grupos = new HashMap<>();
            grupos.put("masculino", new ArrayList<>());
            grupos.put("feminino", new ArrayList<>());

            while (true) {
                System.out.print("Digite o nome e o sexo separados por vírgula (ou 'sair' para encerrar): ");
                String entrada = scanner.nextLine().trim();
                if (entrada.equalsIgnoreCase("sair")) {
                    break;
                }

                String[] partes = entrada.split(",");
                if (partes.length != 2) {
                    System.out.println("Entrada inválida! Digite o nome e o sexo separados por vírgula.");
                    continue;
                }

                String nome = partes[0];
                String sexo = partes[1];

                List<String> grupo = grupos.get(sexo);
                if (grupo != null) {
                    grupo.add(nome);
                } else {
                    System.out.println("Sexo inválido! Digite 'masculino' ou 'feminino'.");
                }
            }

            System.out.println("Nomes no grupo masculino: " + grupos.get("masculino"));
            System.out.println("Nomes no grupo feminino: " + grupos.get("feminino"));
        }


}