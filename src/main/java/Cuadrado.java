import java.util.List;

/**
 * Created by damian on 26/08/16.
 */
public class Cuadrado extends Figura {
    public int lado;

    public Cuadrado(int i) {
        this.lado = i;
    }

    public double area() {
        return (this.lado * this.lado);
    }

    public double perimetro() {
        return (this.lado * 4);
    }

    public double sumarAreasDeCuadrados(List<Cuadrado> cuadrados) {
        double sumarAreas=0;
        for(Cuadrado c: cuadrados){
            sumarAreas = sumarAreas + c.area();
        }

        return sumarAreas;

    }

}
