import java.util.List;

/**
 * Created by damian on 26/08/16.
 */
public class Cuadrado implements Figura {
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

    public double sumarAreasDeFiguras() {
        return 0;
    }

    public boolean compararAreasTotal(Figura fig) {
        return false;
    }

    public boolean compararPerimetros(Figura f2) {
        return false;
    }


    public boolean compararAreasTotal(Cuadrado cuadrado) {
        return(this.area() > cuadrado.area()) ;
    }

    @Override
    public String toString() {
        return ("Cuadrado: lado = " + this.lado);
    }

    public double sumarAreasDeFiguras(List<Figura> rectangulo) {
        double sumarAreas= 0;
        for (Figura C : rectangulo) {
            sumarAreas = sumarAreas + C.area();
        }
        return (sumarAreas);
    }

    public double sumarAreasDeCuadrados(List<Cuadrado> cuadrados) {
        double sumarAreas= 0;
        for (Cuadrado C : cuadrados) {
            sumarAreas = sumarAreas + C.area();
        }
        return (sumarAreas);
    }

    public boolean compararAreas(Cuadrado cuadrado3) {
        return false;
    }

    public boolean compararPerimetrosCuadrados(Cuadrado c2) {
        return true;

    }
}
