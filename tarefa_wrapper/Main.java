package br.com.gpaiva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scan.nextInt();

        Integer numeroConvertido = numero;

        System.out.println(numeroConvertido);

    }
}