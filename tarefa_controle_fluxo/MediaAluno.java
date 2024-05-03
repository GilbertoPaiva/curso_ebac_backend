package tarefa_controle_fluxo;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;

        System.out.print("Digite a nota 1: ");
        nota1 = scanner.nextFloat();

        System.out.print("Digite a nota 2: ");
        nota2 = scanner.nextFloat();

        System.out.print("Digite a nota 3: ");
        nota3 = scanner.nextFloat();

        System.out.print("Digite a nota 4: ");
        nota4 = scanner.nextFloat();


        media = (nota1 + nota2 + nota3 + nota4) / 4;


        if (media >= 7) {
            System.out.println("Parabéns! Você foi aprovado com média " + media);
        } else if (media >= 5) {
            System.out.println("Você está em recuperação com média " + media);
        } else {
            System.out.println("Infelizmente, você foi reprovado com média " + media);
        }
    }
}

