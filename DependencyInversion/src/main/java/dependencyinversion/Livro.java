
package dependencyinversion;

public class Livro implements Produto {
    @Override
    public void verAvaliacoes() {
        System.out.println("Vendo avaliacoes de um Livro");
    }

    @Override
    public void verResumo() {
        System.out.println("Vendo resumo de um Livro");
    }
}
