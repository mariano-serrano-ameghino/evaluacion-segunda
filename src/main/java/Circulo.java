/**
 * Created by alumno on 02/09/16.
 */
public class Circulo extends Figura {
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
}
