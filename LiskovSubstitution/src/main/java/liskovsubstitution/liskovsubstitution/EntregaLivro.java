package liskovsubstitution.liskovsubstitution;

public class EntregaLivro extends EntregaPresencial {
    public EntregaLivro(String titulo, String codigo) {
        super(titulo, codigo);
    }
    
    @Override
    void getLocaisEntrega() {
         System.out.println("Obtendo locais de entrega de livros");
    }
}
