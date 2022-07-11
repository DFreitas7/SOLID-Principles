package liskovsubstitution.liskovsubstitution;

public class EntregaAudioLivro extends EntregaOnline  {
    public EntregaAudioLivro(String titulo, String codigo) {
        super(titulo, codigo);
    }
    
    @Override
    public void getOpcoesSoftware() {
        System.out.println("Obtendo opcoes de entrega no software para audiolivros");
    }
}
