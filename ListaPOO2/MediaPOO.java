package Lista2Metodos;

import java.util.Scanner;

public class MediaPOO {

    public static double calcularAC1(double nota) {
        return nota * 0.15;
    }

    public static double calcularAC2(double nota) {
        return nota * 0.30;
    }

    public static double calcularAG(double nota) {
        return nota * 0.10;
    }

    public static double calcularAF(double nota) {
        return nota * 0.45;
    }

    public static double calcularMediaFinal(double ac1, double ac2, double ag, double af) {
        return ac1 + ac2 + ag + af;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota da AC1:");
        double ac1 = input.nextDouble();

        System.out.println("Digite a nota da AC2:");
        double ac2 = input.nextDouble();

        System.out.println("Digite a nota da AG:");
        double ag = input.nextDouble();

        System.out.println("Digite a nota da AF:");
        double af = input.nextDouble();


        double pAC1 = calcularAC1(ac1);
        double pAC2 = calcularAC2(ac2);
        double pAG = calcularAG(ag);
        double pAF = calcularAF(af);

        double mediaFinal = calcularMediaFinal(pAC1, pAC2, pAG, pAF);
        if (mediaFinal < 7) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado!\n");
            System.out.println("Média final do aluno: " + mediaFinal);

        }
    }
}