public class Dispositivo {
    private int codigo;
    private String nome;
    private Usuario usuario;
    
    Dispositivo(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void usar(){
        System.out.println(usuario.getNome() + " está usando o dispositivo " + nome);
    }
}