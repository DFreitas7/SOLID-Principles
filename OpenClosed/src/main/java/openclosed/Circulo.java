
package openclosed;

public class Circulo implements FormaGeometrica {
    private final Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }
    
    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
}
