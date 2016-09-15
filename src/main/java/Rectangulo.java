/**
 * Created by alumno on 02/09/16.
 */
public class Rectangulo implements Figura {
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

    public double sumarAreasDeFiguras() {
        return 0;
    }

    public boolean compararAreasTotal(Figura fig) {
        return false;
    }

    public boolean compararPerimetros(Figura f2) {
        return false;
    }

    @Override
    public String toString() {
        return (" Rectangulo: Altura Base = 3");
    }
}
