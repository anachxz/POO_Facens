//Faça um programa que receba um número e informe se ele é ímpar ou pa

import java.util.Scanner;

public class Exercicio5 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            System.out.println("Digite um número inteiro: ");
            int numeroInteiro = sc.nextInt();

            if (numeroInteiro % 2 == 0) {
                System.out.println("O número é par");
            } else {

                System.out.println("O número é ímpar");
            }
        }
    }