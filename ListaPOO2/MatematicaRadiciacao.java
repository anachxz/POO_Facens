package Lista2Metodos;

import java.util.Scanner;

public class MatematicaRadiciacao {

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

            case 'r':
                System.out.println("Resultado: " + mat.radiciacao(n1, n2));
                break;

            default:
                System.out.println("Operação inválida.");
        }

    }
}

class Matematica3 {

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

    public double radiciacao(int numero, int indice) {
        return Math.pow(numero, 1.0 / indice);
    }
}