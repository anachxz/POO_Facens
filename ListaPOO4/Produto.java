package ListaPOO4;

import java.time.LocalDate;

public class Produto {

    String nome;
    double precoCusto;
    double precoVenda;
    LocalDate dataFabricacao;
    LocalDate dataValidade;

    public Produto(String nome, double precoCusto, double precoVenda,
                   LocalDate dataFabricacao, LocalDate dataValidade) {

        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    public Produto(String nome, double precoCusto, double precoVenda,
                   LocalDate dataFabricacao) {

        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataFabricacao.plusMonths(1);
    }

    public Produto(String nome, double precoCusto) {

        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoCusto * 1.10;
        this.dataFabricacao = LocalDate.now();
        this.dataValidade = dataFabricacao.plusMonths(1);
    }
}
