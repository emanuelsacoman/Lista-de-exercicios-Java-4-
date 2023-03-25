public class AppTrabalho {
    public static void main(String[] args){
        Dispositivo dispositivo1 = new Dispositivo(1, "Notebook");
        Dispositivo dispositivo2 = new Dispositivo(2, "Desktop");

        Usuario usuario1 = new Usuario(1, "Theodoro");
        Usuario usuario2 = new Usuario(2, "Ana");

        usuario1.setDispositivo(dispositivo1);
        dispositivo1.setUsuario(usuario1);
        usuario1.trabalhar();
        usuario2.setDispositivo(dispositivo2);
        dispositivo2.setUsuario(usuario2);
        usuario2.trabalhar();
    }
}