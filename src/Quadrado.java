public class Quadrado implements FiguraGeometrica2D{

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public String tipo() {
        return "Quadrado";
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public int compareTo(FiguraGeometrica2D o) {
        return Double.compare(area(), o.area());
    }
}
