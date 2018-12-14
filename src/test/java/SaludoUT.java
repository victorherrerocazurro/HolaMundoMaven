import com.curso.ecosistema.holamundomaven.Saludo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

/**
 * Los requisitos que nos llevan a este test son:
 *
 * -la aplicacion deberia retornar un "Hola Mundo!!"
 * -la aplicacion deberia retornar un "Hola Juan!!" cuando se le pasa Juan por parametro
 * -la aplicacion deberia retornar un "Hello Juan!!" cuando se le pasa Juan por parametro
 * y el idioma es ingles
 *
 */
public class SaludoUT {

    //SUT
    private Saludo sut = new Saludo();

    @Test
    public void validarSaludarHolaMundo(){
        //Definir resultados esperados
        String resultadoEsperado = "Hola Mundo!!";

        //Agitar el sut
        String resultadoObtenido = sut.saludaAlMundo();

        //Asertar
        Assert.assertEquals(resultadoEsperado,resultadoObtenido);

    }

    @Test
    public void validarSaludarHolaJuan(){

        //Paraetros de entrada
        String nombre = "Juan";

        //Definir resultados esperados
        String resultadoEsperado = "Hola Juan!!";

        //Agitar el sut
        String resultadoObtenido = sut.saludaAlguien(nombre);

        //Asertar
        Assert.assertEquals(resultadoEsperado,resultadoObtenido);


        //Assert.fail("Not implemented");
    }

    @Test
    public void validarSaludarHelloJuan(){

        //Paraetros de entrada
        String nombre = "Juan";

        //Definir resultados esperados
        String resultadoEsperado = "Hello Juan!!";

        //Agitar el sut
        String resultadoObtenido = sut.saludaAlguien(nombre, Locale.ENGLISH);

        //Asertar
        Assert.assertEquals(resultadoEsperado,resultadoObtenido);
    }

    @Test
    public void validarSaludarHolaJuanOtroIdioma(){

        //Paraetros de entrada
        String nombre = "Juan";

        //Definir resultados esperados
        String resultadoEsperado = "Hola Juan!!";

        //Agitar el sut
        String resultadoObtenido = sut.saludaAlguien(nombre, new Locale("es"));

        //Asertar
        Assert.assertEquals(resultadoEsperado,resultadoObtenido);
    }

    @Test
    public void validarSaludarHolaMaria(){

        //Paraetros de entrada
        String nombre = "Maria";

        //Definir resultados esperados
        String resultadoEsperado = "Hola Maria!!";

        //Agitar el sut
        String resultadoObtenido = sut.saludaAlguien(nombre);

        //Asertar
        Assert.assertEquals(resultadoEsperado,resultadoObtenido);


        //Assert.fail("Not implemented");
    }

}
