package openclosed;

public class Retangulo implements FormaGeometrica {
    private final Double largura;
    private final Double altura;

    public Retangulo(Double largura, Double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return largura * altura;
    }
}
