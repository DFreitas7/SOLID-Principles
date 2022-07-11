package liskovsubstitution.liskovsubstitution;

public class EntregaPoster extends EntregaPresencial {
    public EntregaPoster(String titulo, String codigo) {
        super(titulo, codigo);
    }
        
    @Override
    void getLocaisEntrega() {
         System.out.println("Obtendo locais de entrega de posteres");
    }
}
