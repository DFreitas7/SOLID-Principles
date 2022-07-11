package dependencyinversion;

public class DependencyInversion {

    public static void main(String[] args) {
        DVD dvd = new DVD();
        Livro livro = new Livro();
        
        Estante estanteDVD = new Estante(dvd);
        Estante estanteLivro = new Estante(livro);
        
        estanteDVD.getProduto().verAvaliacoes();
        estanteDVD.getProduto().verResumo();
        
        estanteLivro.getProduto().verAvaliacoes();
        estanteLivro.getProduto().verResumo();
    }
}
