package liskovsubstitution.liskovsubstitution;

public class LiskovSubstitution {

    public static void main(String[] args) {
        Entrega entregaLivro = new EntregaLivro("Clean Code", "CC-UB");
        Entrega entregaPoster = new EntregaPoster("Uncle Bob", "PT-UB");
        Entrega entregaAudioLivro = new EntregaAudioLivro("Clean Code", "CC-UB");
        
        System.out.println(entregaLivro.getTitulo());
        entregaLivro.getOpcoesEntrega();
        entregaPoster.getOpcoesEntrega();
        entregaAudioLivro.getOpcoesEntrega();
        
    }
}
