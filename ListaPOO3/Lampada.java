package EstudoPOO2;

public class Lampada {

    boolean status;

    public void ligar() {
        status = true;
        System.out.println("A lâmpada está ligada.");
    }

    public void desligar() {
        status = false;
        System.out.println("A lâmpada está desligada.");
    }

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.desligar();
    }
}
