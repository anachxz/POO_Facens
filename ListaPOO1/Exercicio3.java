//Faça um programa que lê dois números e responda se o primeiro é o maior

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {

            System.out.println("O número 1 é maior que o número 2");
        } else if (num2 > num1) {

            System.out.println("O numero 1 não é maior que número 2");

        }
    }
}