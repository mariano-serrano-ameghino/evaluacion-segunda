import java.util.List;

/**
 * Created by alumno on 02/09/16.
 */
public class Rectangulo extends Figura {
    int altura;
    int base;

    public Rectangulo(int i, int i1) {
        this.base=i;
        this.altura=i1;
    }

    public double area() {
        return (this.base * this.altura);
    }

    public double perimetro() {
        return (2 *(this.base + this.altura));
    }
}
