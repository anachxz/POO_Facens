/*Modifique a classe Matematica, criando um método para calcular a potenciação entre dois números.
Para a implementação utilize a estrutura de repetição for para calcular o resultado da potênciação.
Modifique a classe com método main para que o método potenciacao possa ser executado como uma
das operações anteriores/*/

package Lista2Metodos;

import java.util.Scanner;

public class MatematicaPotencia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Matematica2 mat = new Matematica2();

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("Escolha a operação (+ - * / ^ r): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Resultado: " + mat.soma(n1, n2));
                break;

            case '-':
                System.out.println("Resultado: " + mat.subtracao(n1, n2));
                break;

            case '*':
                System.out.println("Resultado: " + mat.multiplicacao(n1, n2));
                break;

            case '/':
                System.out.println("Resultado: " + mat.divisao(n1, n2));
                break;

            case '^':
                System.out.println("Resultado: " + mat.potenciacao(n1, n2));
                break;

            default:
                System.out.println("Operação inválida.");
        }

    }
}

class Matematica2 {

    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public int divisao(int a, int b) {
        if (b == 0) {
            System.out.println("Não é possível dividir por zero!");
            return 0;
        }
        return a / b;
    }

    public int potenciacao(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    }

