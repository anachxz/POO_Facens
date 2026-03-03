//Escreva uma classe que receberá como parâmetro três números inteiros para ordenar. Crie uma classe
//com método main que instancie a classe Ordena, receba três números inteiros e exiba o resultado da
//execução do objeto ordena


package Lista2Metodos;

import java.util.Scanner;

public class MainOrdena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ordena ordena = new Ordena();

        System.out.println("Digite 3 numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        ordena.ordenar(num1, num2, num3);
    }
}
class Ordena{
    public void ordenar(int a, int b, int c){
        int temp;

        if (a > b) { temp = a; a = b; b = temp; }
        if (a > c) { temp = a; a = c; c = temp; }
        if (b > c) { temp = b; b = c; c = temp; }

        System.out.println("Ordem crescente: " + a + " " + b + " " + c);
    }
}
