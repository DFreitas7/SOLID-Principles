package singleresponsbility;

public class Livro {
    private final String titulo;
    private final String codigo;
    private final Autor autor;

    public Livro(String titulo, String codigo, Autor autor) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return this.getCodigo();
    }
    
    
}
