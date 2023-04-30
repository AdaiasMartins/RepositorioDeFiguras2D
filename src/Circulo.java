public class Circulo implements FiguraGeometrica2D {

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public String tipo() {
        return "circulo";
    }

    @Override
    public double area() {
        return Math.PI * (raio * raio);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public int compareTo(FiguraGeometrica2D o) {
        return Double.compare(area(), o.area());
    }
}
