import contenedor.calculadora;
import org.junit.Assert;
import org.junit.Test;

public class calculadorTest {

    @Test
    public void suma(){
        calculadora calc=new calculadora();

Integer resultadoEsperado=10;

Integer uno=5;
Integer dos=5;
Integer resultadoObtenido=calc.suma(uno,dos);
        Assert.assertEquals(resultadoEsperado,resultadoObtenido);

    }
}
