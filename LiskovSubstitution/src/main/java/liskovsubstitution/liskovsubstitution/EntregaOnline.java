package liskovsubstitution.liskovsubstitution;

public class EntregaOnline extends Entrega {

    public EntregaOnline(String titulo, String codigo) {
        super(titulo, codigo);
    }
    
    @Override
    public void getOpcoesEntrega() {
        getOpcoesSoftware();
    }
    
    public void getOpcoesSoftware() {
         System.out.println("Obtendo opcoes de entrega no software");
     }
}
