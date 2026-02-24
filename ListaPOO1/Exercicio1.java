
//Usando a entrada de dados recebequatro valores decimais, respectivos as
// notas de cada bimestre.
// Depois de coletadas a quatro notas, realizar
// operação de soma e médiadas notas, mostrando em tela.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nCálculo de média de 4 notas: ");


        double soma = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite o " + i + "º nota: ");
            double numero = sc.nextDouble();
            soma += numero;
        }

        double media = soma / 4;

        System.out.println("Média: " + media);
    }
}