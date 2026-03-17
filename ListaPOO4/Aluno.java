package ListaPOO4;

public class Aluno {

    String nome;
    String ra;
    double[] notas;
    double presenca;
    boolean ead;

    public Aluno(String nome, String ra, double[] notas, double presenca, boolean ead) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
        this.presenca = presenca;
        this.ead = ead;
    }

    public double calcularNotaFinal() {

        if (notas.length <= 2) {
            double soma = 0;
            for (double n : notas) {
                soma += n;
            }
            return soma / notas.length;
        }

        else if (notas.length == 3) {

            double peso1 = 1;
            double peso2 = 2;
            double peso3 = 4;

            return (notas[0]*peso1 + notas[1]*peso2 + notas[2]*peso3)
                    /(peso1+peso2+peso3);
        }

        else if (notas.length == 4) {

            double ac1 = notas[0];
            double ac2 = notas[1];
            double ag = notas[2];
            double af = notas[3];

            return (ac1*0.15) + (ac2*0.30) + (ag*0.10) + (af*0.45);
        }

        return 0;
    }

    public String verificarSituacao() {

        double notaFinal = calcularNotaFinal();

        if (ead) {
            return notaFinal >= 5 ? "Aprovado" : "Reprovado";
        }

        if (notaFinal >= 5 && presenca >= 75) {
            return "Aprovado";
        }

        return "Reprovado";
    }

    public void imprimirDados() {

        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.println("Nota Final: " + calcularNotaFinal());
        System.out.println("Situação: " + verificarSituacao());
    }
}