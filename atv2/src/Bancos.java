public class Bancos {
    private String bancos;
    private String fabricante;
    
    Bancos(String bancos, String fabricante){
        this.bancos = bancos;
        this.fabricante = fabricante;
    }

    public String getBancos(){
        return bancos;
    }

    public String getFabricante(){
        return fabricante;
    }
}