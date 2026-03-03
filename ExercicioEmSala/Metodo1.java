import java.util.Scanner; // Importa a classe Scanner para permitir entrada de dados pelo teclado

public class Metodo1 { // Declaração da classe principal do programa

    public static void main(String[] args) { // Método principal, ponto de entrada do programa
        float n1, n2, n3, resultado; // Declaração das variáveis para armazenar as notas e o resultado da média

        Scanner valor = new Scanner(System.in);
        // Criação do objeto Scanner para ler dados digitados pelo usuário

        System.out.println("Digite a nota 1: ");
        n1 = valor.nextFloat();
        // Lê o primeiro número decimal digitado e armazena na variável n1

        System.out.println("Digite a nota 2: ");
        n2 = valor.nextFloat();
        // Lê o segundo número decimal digitado e armazena na variável n2

        System.out.println("Digite a nota 3: ");
        n3 = valor.nextFloat();
        // Lê o terceiro número decimal digitado e armazena na variável n3

        resultado = calcularMedia(n1, n2, n3);
        // Chama o método calcularMedia passando as três notas como parâmetros
        // O valor retornado é armazenado na variável resultado

        System.out.println("A média final é: " + resultado);
        // Exibe o valor da média retornada pelo método
    }

    // Método responsável apenas por calcular e retornar a média
    public static float calcularMedia(float nota1, float nota2, float nota3){
        float media = (nota1 + nota2 + nota3) / 3;
        // Calcula a média aritmética das três notas

        return media;
        // Retorna o valor calculado para o método que fez a chamada (main)
    }
}