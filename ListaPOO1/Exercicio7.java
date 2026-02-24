//Escreva um algoritmo que receba a idade de 3 pessoas. O algoritmo
// deve verificar se cada indivíduo é maior de idade e calcular a média de idade
// somente das pessoas que têm idade igual ou superior a 18 anos.
// E como saída exibir na tela média das idades dos maiores de 18 anos.


import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int contadorMaiores = 0;

        System.out.println("\nCálculo de média de idade de 3 pessoas:");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = sc.nextInt();

            if (idade >= 18) {
                soma += idade;
                contadorMaiores++;
            }
        }

        if (contadorMaiores > 0) {
            double media = (double) soma / contadorMaiores;
            System.out.println("Média das idades dos maiores de 18: " + media);
        } else {
            System.out.println("Nenhuma pessoa é maior de idade.");
        }

    }
}