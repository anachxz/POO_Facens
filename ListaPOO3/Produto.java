package EstudoPOO2;

public class Produto {

    String nome;
    String marca;
    double precoCusto;
    double precoVenda;

    public double calcularLucro() {
        return precoVenda - precoCusto;
    }

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.marca = "Dell";
        p1.precoCusto = 3000;
        p1.precoVenda = 4200;

        Produto p2 = new Produto();
        p2.nome = "Mouse";
        p2.marca = "Logitech";
        p2.precoCusto = 50;
        p2.precoVenda = 120;

        System.out.println("Produto: " + p1.nome);
        System.out.println("Marca: " + p1.marca);
        System.out.println("Lucro: " + p1.calcularLucro());

        System.out.println();

        System.out.println("Produto: " + p2.nome);
        System.out.println("Marca: " + p2.marca);
        System.out.println("Lucro: " + p2.calcularLucro());
    }
}