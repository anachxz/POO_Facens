//Faça um programa que receba e armazene em um array os nomes de 10 pessoas.
 //       O programa deve sortear um ganhador entre os nomes
 //       presentes no array e apresentar o ganhador na tela.

import java.util.Scanner;
import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] nomes = new String[10];

        System.out.println("Digite o nome de 10 pessoas:");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        int indiceSorteado = random.nextInt(10);

        System.out.println("\nGanhador do sorteio: " + nomes[indiceSorteado]);

    }
}