//Faça um programa que recebe um número e retorna o resultado de seu
// valor em fatorial. Por exemplo: 5! = 5 x 4 x 3 x 2 x 1 = 120.

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        int fatorial = 1;
        int i = 1;

        while (i <= num) {
            fatorial = fatorial * i;
            i += 1;
        }

        System.out.println("Fatorial de " + num + " é " + fatorial);
    }
}