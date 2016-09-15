import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by damian on 26/08/16.
 */
public class FigurasTest{

    @Test
    public void calcularArea() {
        Figura fig = new Rectangulo(5,10);

        Assert.assertEquals(50, fig.area(), 0);

    }

    @Test
    public void calcularPerimetro() {
        Figura fig = new Circulo(10);

        Assert.assertEquals(Math.PI*10, fig.perimetro(),0);

    }

    @Test
    public void calcularAreas(){
        Cuadrado cuadrado = new Cuadrado(1);
        Figura fig  = new Cuadrado(5);
        Figura fig2 = new Rectangulo(5,10);
        Figura fig3 = new Circulo(20);

        List<Figura> figuras = new ArrayList<Figura>();
        figuras.add(fig);
        figuras.add(fig2);
        figuras.add(fig3);

        Assert.assertEquals(1331, cuadrado.sumarAreasDeFiguras(figuras),10);
    }

    @Test
    public void calcularAreasTotal(){
        Figura fig  = new Cuadrado(5);
        Figura fig2 = new Rectangulo(5,10);

        boolean resultado = fig.compararAreasTotal(fig2);

        Assert.assertFalse(resultado);
    }

    @Test
    public void cuadradoToString() {
        Cuadrado cuadrado  = new Cuadrado(5);
        Cuadrado cuadrado2  = new Cuadrado(10);

        Assert.assertEquals(cuadrado.toString() , "Cuadrado: lado = 5");
        Assert.assertEquals(cuadrado2.toString() , "Cuadrado: lado = 10");
    }

    @Test
    public void compararPerimetros() {
        Figura f1= new Cuadrado(5);
        Figura f2= new Circulo(10);
        boolean res=f1.compararPerimetros(f2);

        Assert.assertFalse(res);
    }


}
