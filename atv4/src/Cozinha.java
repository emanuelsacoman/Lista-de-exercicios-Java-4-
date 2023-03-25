public class Cozinha {
    private Liquidificador liquidificador;
    private Microondas microondas;
    private Geladeira geladeira;

    public Cozinha(Liquidificador liquidificador, Microondas microondas, Geladeira geladeira) {
        this.liquidificador = liquidificador;
        this.microondas = microondas;
        this.geladeira = geladeira;
    }

    public void ligar() {
        this.liquidificador.ligar();
        this.microondas.ligar();
        this.geladeira.ligar();
    }

    public void desligar() {
        this.liquidificador.desligar();
        this.microondas.desligar();
        this.geladeira.desligar();
    }
}