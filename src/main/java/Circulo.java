/**
 * Created by alumno on 02/09/16.
 */
public class Circulo implements Figura {
    public int radio;

    public Circulo(int i) {
        this.radio= i;
    }

    public double area() {
        return (Math.PI * (this.radio * this.radio));
    }

    public double perimetro() {
        return (Math.PI * this.radio);
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
        return ("circulo: radio = 5.0");
    }
}
