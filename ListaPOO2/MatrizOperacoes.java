package Lista2Metodos;

import java.util.Scanner;
import java.util.Arrays;

public class MatrizOperacoes {

    static int[][] matriz = new int[5][5];
    static Scanner sc = new Scanner(System.in);


    public static void preencherMatriz() {
        System.out.println("Preenchendo a matriz 5x5:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite um valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }


    public static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // b) Ordenar matriz
    public static void ordenarMatriz() {
        int[] vetor = new int[25];
        int k = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                vetor[k++] = matriz[i][j];
            }
        }

        Arrays.sort(vetor);

        k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = vetor[k++];
            }
        }

        System.out.println("\nMatriz ordenada:");
        mostrarMatriz(matriz);
    }


    public static void matrizPares() {
        int[][] pares = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares[i][j] = matriz[i][j];
                }
            }
        }

        System.out.println("\nMatriz com números pares:");
        mostrarMatriz(pares);
    }


    public static void matrizMultiplosDe5() {
        int[][] mult5 = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 5 == 0) {
                    mult5[i][j] = matriz[i][j];
                }
            }
        }

        System.out.println("\nMatriz com múltiplos de 5:");
        mostrarMatriz(mult5);
    }


    public static void menu() {
        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Preencher matriz");
            System.out.println("2 - Ordenar matriz");
            System.out.println("3 - Mostrar números pares");
            System.out.println("4 - Mostrar múltiplos de 5");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    preencherMatriz();
                    break;

                case 2:
                    ordenarMatriz();
                    break;

                case 3:
                    matrizPares();
                    break;

                case 4:
                    matrizMultiplosDe5();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    public static void main(String[] args) {
        menu();
    }
}