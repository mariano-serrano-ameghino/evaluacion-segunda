import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by damian on 26/08/16.
 */
public class CuadradoTest {


    @Test
    public void crearCuadrado(){
        Cuadrado cuadrado = new Cuadrado(5);

        Assert.assertEquals(cuadrado.lado, 5, 0);
    }


    @Test
    public void area(){
        Cuadrado cuadrado = new Cuadrado(10);

        Assert.assertEquals(100, cuadrado.area(), 0);
    }


    @Test
    public void calcularPerimetro(){
        Cuadrado cuadrado = new Cuadrado(5);

        Assert.assertEquals(20, cuadrado.perimetro(), 0);
    }



    @Test
    public void sumarTodasLasAreas(){
        Cuadrado cuadrado1 = new Cuadrado(3);
        Cuadrado cuadrado2 = new Cuadrado(2);
        Cuadrado cuadrado3 = new Cuadrado(10);

        List<Cuadrado> cuadrados = Arrays.asList(cuadrado1,cuadrado2,cuadrado3);

        Assert.assertEquals(113, cuadrado1.sumarAreasDeCuadrados(cuadrados), 0);
    }

    @Test
    public void compararAreasDeCuadrados(){
        Cuadrado cuadrado2 = new Cuadrado(2);
        Cuadrado cuadrado3 = new Cuadrado(10);

        boolean resultadoCompararAreas = cuadrado2.compararAreas(cuadrado3);

        Assert.assertFalse(resultadoCompararAreas);
    }

    @Test
    public void compararPerimetrosCuadrados(){
        Cuadrado c1 = new Cuadrado(5);
        Cuadrado c2 = new Cuadrado(10);

        boolean resu = c1.compararPerimetrosCuadrados(c2);

        Assert.assertTrue(resu);
    }

}

