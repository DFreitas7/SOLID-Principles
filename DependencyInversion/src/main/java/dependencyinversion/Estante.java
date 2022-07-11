package dependencyinversion;

public class Estante {
    private final Produto produto;

    public Estante(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }
}
