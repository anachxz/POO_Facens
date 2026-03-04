package Lista2Metodos;


import java.util.Scanner;


public class ConversorMoedas {
    static Scanner sc = new Scanner(System.in);

    static double dolar = 5.20;
    static double libra = 6.94 ;
    static double franco = 6.40;
    static double iene = 0.034;

    public static void realParaMoedas() {
        System.out.print("Digite o valor em reais: ");
        double reais = sc.nextDouble();

        System.out.println("Valor em reais: " + reais);
        System.out.println("Valor em dolar: " + (reais / dolar));
        System.out.println("Valor em libra: " + (reais/libra));
        System.out.println("Valor em franco: " +(reais/franco) );
        System.out.println("Valor em iene: " + (reais/iene));


    }
    public static void moedasParaReal() {
        System.out.print("Escolha a moeda para converter: ");
        System.out.println("1. Dolar");
        System.out.println("2. Libra");
        System.out.println("3. Franco");
        System.out.println("4. Iene");
        int opcao = sc.nextInt();
        System.out.println("Digite o valor em reais: ");
        double reais = sc.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Valor em dolar: " + (reais / dolar));
                break;
                case 2:
                    System.out.println("Valor em libra: " + (reais /libra));
                    break;
                    case 3:
                        System.out.println("Valor em franco: " + (reais /franco));
                        break;
                        case 4:
                        System.out.println("Valor em iene: " + (reais /iene));
                        break;
                        default:
                            System.out.println("Inválido");
        }
    }
    public static void menu() {

        int opcao;

        do {

            System.out.println("\nMENU DE CONVERSÃO");
            System.out.println("1 - Converter REAL para outras moedas");
            System.out.println("2 - Converter outras moedas para REAL");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    realParaMoedas();
                    break;

                case 2:
                    moedasParaReal();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    public static void main(String[] args) {
        menu();
    }
}


