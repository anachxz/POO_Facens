package EstudoPOO2;

public class Carro {

    public String placa;
    public int velocidade_atual;
    public char marcha_atual;
    public boolean freio_de_mao_puxado;
    public boolean chave_virada;

    public void ligar() {
        this.chave_virada = true;
        this.freio_de_mao_puxado = false;
    }

    public void acelerarAte(int velocidade) {
        this.velocidade_atual = velocidade;
        System.out.println("Velocidade atual: " + this.velocidade_atual + " km/h");
    }

    public void mudarMarcha(char marcha) {
        this.marcha_atual = marcha;
    }

    public void parar() {
        this.freio_de_mao_puxado = true;
        this.velocidade_atual = 0;
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligar();
        carro.acelerarAte(30);
        carro.mudarMarcha('1');
        carro.parar();
    }
}