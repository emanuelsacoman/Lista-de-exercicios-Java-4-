public class CarroApp {
    public static void main(String[] args) throws Exception {
        Motor m1 = new Motor("3.8L V6");
        Carro c1 = new Carro("Mustang", "Conversível", "Ford", m1);
        
        Motor m2 = new Motor("Zetec Roçam 1,0");
        Carro c2 = new Carro("Ka", "Popular", "Ford", m2);
        
        Motor m3 = new Motor("2.4 Ecotec");
        Carro c3 = new Carro("Captiva", "SUV", "Chevrolet", m3);

        System.out.println(c1.toString());

        System.out.println(c2.toString());
                            
        System.out.println(c3.toString());
    }
}