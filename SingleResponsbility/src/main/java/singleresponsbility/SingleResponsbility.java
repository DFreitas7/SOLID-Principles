package singleresponsbility;

public class SingleResponsbility {

    public static void main(String[] args) {
        Repositorio<Autor> repositorioAutores = new Repositorio<>();
        Repositorio<Livro> repositorioLivros = new Repositorio<>();
        
        repositorioAutores.insert(new Autor("Robert C. Martin"));
        
        repositorioLivros.insert(new Livro("Clean Code", "Clean-Code", repositorioAutores.find("Robert C. Martin")));
        
        repositorioAutores.list();
        repositorioLivros.list();
        
    }
}
