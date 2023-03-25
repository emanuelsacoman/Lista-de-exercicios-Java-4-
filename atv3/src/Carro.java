public class Carro {
    private String marca;
    private String modelo;
    private String fabricante;
    private Motor motor;
    private static int contador=0; //não obrigatório

    Carro(String marca, String modelo, String fabricante, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.fabricante = fabricante;
    }
    
    @Override
    public String toString(){
        contador++; //não obrigatório
        return "Carro"+contador+" [Marca: " + marca + ", Modelo: " + modelo + ", Fabricante: " 
        + fabricante + ", Motor: "+ motor.getTipo() + "]";
    }
}