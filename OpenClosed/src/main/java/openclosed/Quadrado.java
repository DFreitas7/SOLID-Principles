package openclosed;

public class Quadrado implements FormaGeometrica{
    private final Double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return Math.pow(this.lado, 2);
    }
}
