//Modifique o programa do exercício anterior para que
// leia dois números e responda se o primeiro
// é maior ou se o segundo é o maior.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {

            System.out.println("O número 1 é maior que o número 2");
        } else if (num2 > num1) {

            System.out.println("O número 2 é maior que o número 1");

        }
    }
}