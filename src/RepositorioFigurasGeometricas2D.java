import java.util.ArrayList;
import java.util.List;

public class RepositorioFigurasGeometricas2D {

    List<FiguraGeometrica2D> listaDeFiguras = new ArrayList<>();

    public void adicionar(FiguraGeometrica2D novafigura){
        listaDeFiguras.add(novafigura);
    }

    public void calcularArea(FiguraGeometrica2D figuraacalcular){
        figuraacalcular.area();
    }

    public void calcularPerimetro(FiguraGeometrica2D figuraacalcular){
        figuraacalcular.perimetro();
    }




}
