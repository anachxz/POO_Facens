//Faça um programa que receba o nome de uma pessoa e seu respetivo sexo. Caso o sexo da
// pessoa seja “F”, apresente na tela “Ilmo. Sra.” acompanhado do nome da pessoa. Se o sexo
// informado for “M”, exiba “Ilmo. Sr.” seguido do nome da pessoa.
// Caso a entrada não corresponda a nenhuma dessas opções, exiba “sexo inválido”.


import java.util.Scanner;


public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o sexo, M/m ou F/f: ");

        char sexo = sc.next().charAt(0);


                System.out.println("Você escolheu " + sexo);
                if (sexo == 'F'|| sexo== 'f') {
                    System.out.println("Ilmo. Sra.");
                } else if (sexo == 'M'|| sexo == 'm') {
                    System.out.println("Ilmo. Sr.");
                } else {
                    System.out.println("Sexo inválido");
                }

        }
    }

