public class CarroApp {
    public static void main(String[] args) throws Exception {
        Motor m1 = new Motor("3.8L V6");
        Bancos b1 = new Bancos("2", "Ford");
        Carro c1 = new Carro("Mustang", "Conversível", m1, b1);
        
        Motor m2 = new Motor("Zetec Roçam 1,0");
        Bancos b2 = new Bancos("4", "Ford");
        Carro c2 = new Carro("Ka", "Popular", m2, b2);
        
        Motor m3 = new Motor("2.4 Ecotec");
        Bancos b3 = new Bancos("4", "Chevrolet");
        Carro c3 = new Carro("Captiva", "SUV", m3, b3);

        System.out.println( c1.getTipoFabricante() + " " +
                            c1.getMarca() + " " +
                            c1.getModelo() + " " +
                            c1.getTipoMotor() + " " +
                            c1.getQuantBancos());

        System.out.println( c2.getTipoFabricante() + " " +
                            c2.getMarca() + " " +
                            c2.getModelo() + " " +
                            c2.getTipoMotor() + " " +
                            c2.getQuantBancos());
                            
        System.out.println( c3.getTipoFabricante() + " " +
                            c3.getMarca() + " " +
                            c3.getModelo() + " " +
                            c3.getTipoMotor() + " " +
                            c3.getQuantBancos());
    }
}