//Elabore uma classe utilizando métodos que seja capaz de fazer as quatro operações matemáticas
//básicas. Crie uma classe com método main que instancie a classe a classe Matematica, receba dois
//números inteiros, e qual operação a ser executada e exiba o resultado da execução do objeto
//matematica.




package Lista2Metodos;

import java.util.Scanner;

class Lista2Metodos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Matematica mat = new Matematica();

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("Escolha a operação (+ - * /): ");
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
            default:
                System.out.println("Operação inválida.");
        }

    }
}
public class Matematica {

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
}