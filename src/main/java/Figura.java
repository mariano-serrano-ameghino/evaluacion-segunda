import java.util.List;

/**
 * Created by alumno on 02/09/16.
 */
public class Figura {
    int base;
    int altura;
    int radio;

    public double area() {
        return (2*(this.base + this.altura));
    }

    public double perimetro() {
        return (Math.PI * this.radio);
    }

    public double sumarAreasDeFiguras(List<Figura> figuras) {
        double sumarAreas=0;
        for (Figura f : figuras){
            sumarAreas= sumarAreas + f.area();
        }
        return sumarAreas;
    }
}
