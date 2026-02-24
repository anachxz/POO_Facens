//Usando as estruturas de Decisão, construa um programa que tenha o
// seguinte comportamento:
//Ao digitar o número 1 o programa irá mostrar “Domingo”.
// Faça isso para todos os dias da semana. Tenha em mente que terá o seguinte comportamento
//
//1 -> Domingo
//
//2 -> Segunda
//
//3 -> Terça
//
//4 -> Quarta
//
//5 -> Quinta
//
//6 -> Sexta
//
//7 -> Sábado

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o dia da semana: ");

        System.out.println("1 - Domingo");

        System.out.println("2 - Segunda");

        System.out.println("3 - Terça");

        System.out.println("4 - Quarta");

        System.out.println("5 - Quinta");

        System.out.println("6 - Sexta");

        System.out.println("7 - Sábado");

        System.out.println("Digite o número da opção: ");

        int opcao = sc.nextInt();

        switch (opcao) {

            case 1:

                System.out.println("Você escolheu Domingo");

                break;

            case 2:
                System.out.println("Você escolheu Segunda");
                break;

            case 3:
                System.out.println("Você escolheu Terça");
                break;

            case 4:
                System.out.println("Você escolheu Quarta");
                break;

            case 5:
                System.out.println("Você escolheu Quinta");
                break;

            case 6:
                System.out.println("Você escolheu Sexta");
                break;

            case 7:
                System.out.println("Você escolheu Sábado");
                break;

            default:
                System.out.println("Opção invalida");

        }
    }
}