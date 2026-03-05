package Lista2Metodos;

import java.util.Scanner;

public class NumeroDivisivel {

    public static boolean verificarDivisao(int num1, int num2) {
        return num1 % num2 == 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = input.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = input.nextInt();

        if (verificarDivisao(num1, num2)) {
            System.out.println("É divisível!");
        } else {
            System.out.println("Não é divisível.");
        }
    }
}