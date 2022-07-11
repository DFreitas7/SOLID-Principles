package liskovsubstitution.liskovsubstitution;

public class EntregaPresencial extends Entrega {

    public EntregaPresencial(String titulo, String codigo) {
        super(titulo, codigo);
    }

    @Override
    public void getOpcoesEntrega() {
        getLocaisEntrega();
    }
        
    void getLocaisEntrega() {
         System.out.println("Obtendo locais de entrega");
     }
}
