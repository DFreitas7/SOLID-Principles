package dependencyinversion;

public class DVD implements Produto {

    @Override
    public void verAvaliacoes() {
        System.out.println("Vendo avaliacoes de um DVD");
    }

    @Override
    public void verResumo() {
        System.out.println("Vendo resumo de um DVD");
    }
    
    
}
