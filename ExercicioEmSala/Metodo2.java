import java.util.Scanner; // Importa a classe Scanner para leitura de dados pelo teclado

public class Metodo2 {

    // Scanner declarado como atributo da classe para ser reutilizado em todos os métodos
    static Scanner valor = new Scanner(System.in);

    public static void main(String[] args) {
        float n1, n2, n3, mediaFinal;
        // Declaração das variáveis para armazenar as notas e a média final

        String nomeAluno = lerNome();
        // Chamada do método responsável por ler o nome do aluno

        n1 = lerNota(1);
        // Chamada do método para ler a primeira nota

        n2 = lerNota(2);
        // Chamada do método para ler a segunda nota

        n3 = lerNota(3);
        // Chamada do método para ler a terceira nota

        mediaFinal = lerMedia(n1, n2, n3);
        // Chamada do método que calcula e retorna a média das três notas

        System.out.println("--- BOLETIM ---");
        // Exibe título do boletim

        System.out.println("Estudante: " + nomeAluno);
        // Exibe o nome do aluno informado

        System.out.println("Média: " + mediaFinal);
        // Exibe o valor da média calculada
    }

    // Método responsável por ler e retornar o nome do aluno
    public static String lerNome(){
        System.out.print("Digite o nome do aluno: ");
        String nome = valor.nextLine();
        // Lê a linha digitada pelo usuário e armazena na variável nome
        return nome;
        // Retorna o nome para o método main
    }

    // Método responsável por ler e retornar uma nota
    public static float lerNota(int ordem){
        System.out.print("Digite a nota " + ordem + ": ");
        float nota = valor.nextFloat();
        // Lê um número decimal digitado pelo usuário
        return nota;
        // Retorna a nota lida para o método main
    }

    // Método responsável apenas por calcular e retornar a média
    public static float lerMedia(float nota1, float nota2, float nota3){
        float media = (nota1 + nota2 + nota3) / 3;
        // Calcula a média aritmética das três notas
        return media;
        // Retorna o valor calculado para quem chamou o método
    }
}