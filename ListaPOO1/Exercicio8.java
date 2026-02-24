//Escreva um programa que recebe dois números inteiros e diferentes.
// Depois exibir na tela todos os números pares definidos no
// intervalo dele (utilizar estrutura de repetição).


import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Os números devem ser diferentes.");
        } else {

            int inicio = Math.min(num1, num2);
            int fim = Math.max(num1, num2);

            System.out.println("Números pares no intervalo:");

            for (int i = inicio; i <= fim; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}