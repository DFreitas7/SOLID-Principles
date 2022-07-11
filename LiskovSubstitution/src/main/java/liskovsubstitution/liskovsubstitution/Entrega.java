package liskovsubstitution.liskovsubstitution;

public abstract class Entrega {
    protected String titulo;
    protected String codigo;

    public Entrega(String titulo, String codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public String getCodigo() {
        return codigo;
    }
    public abstract void getOpcoesEntrega();
}
