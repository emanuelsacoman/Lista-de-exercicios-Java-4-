public class Carro {
    private String marca;
    private String modelo;
    private Motor motor;
    private Bancos bancos;

    Carro(String marca, String modelo, Motor motor, Bancos bancos){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.bancos = bancos;
    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getTipoFabricante(){
        return bancos.getFabricante();
    }
    public String getTipoMotor(){
        return motor.getTipo();
    }
    public String getQuantBancos(){
        return bancos.getBancos();
    }   
}