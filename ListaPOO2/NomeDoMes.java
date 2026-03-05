package Lista2Metodos;

import java.util.Scanner;

public class NomeDoMes {
    public static String obterNomeMes(String data){
        String[] partes = data.split("/");
        int mes = Integer.parseInt(partes[1]);

        switch (mes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Mês inválido";

        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma data no formato dd/mm/aa: ");
        String data = input.nextLine();
        String nomeMes = obterNomeMes(data);
        System.out.println("O mês é: " + nomeMes);

    }
}
