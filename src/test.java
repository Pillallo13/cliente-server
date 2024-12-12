import Operaciones.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;;

public class test {

    Operacion suma = new Suma();
    Operacion resta = new Resta();
    Operacion multiplicacion = new Multiplicar();
    Operacion dividir = new Dividir();

    @Test
    public void testOperaciones() {
        assertEquals((10.5 + 5.5), suma.operar(10.5, 5.5), 0);
        assertEquals((10.5 - 5.5), resta.operar(10.5, 5.5), 0);
        assertEquals((10.5 * 5.5), multiplicacion.operar(10.5, 5.5), 0);
        assertEquals((10.5 / 5.5), dividir.operar(10.5, 5.5), 0);
    }

    // Codigo Muerto
    /*
     * public void sample() {
     * 
     * for (Operacion operator : operaciones) {
     * System.out.println(operator.operar(10, 5));
     * System.out.println(operator.operar(10.5f, 5.5f));
     * System.out.println(operator.operar(10.5, 5.5));
     * 
     * }
     * }
     * 
     * public static void main(String[] args) {
     * test lol = new test();
     * lol.sample();
     * 
     * }
     */

    @Test
    public void testSuma() {
        assertEquals(30 + 20, suma.operar(30, 20), 0);
        assertEquals(13 + 50, suma.operar(13, 50), 0);
        assertEquals(46 + 13, suma.operar(46, 13), 0);
        assertEquals(41 + 17, suma.operar(41, 17), 0);
    }

    @Test
    public void testResta() {
        assertEquals(30 - 20, resta.operar(30, 20), 0);
        assertEquals(13 - 50, resta.operar(13, 50), 0);
        assertEquals(46 - 13, resta.operar(46, 13), 0);
        assertEquals(41 - 17, resta.operar(41, 17), 0);

    }

    @Test
    public void testMult() {
        assertEquals(30 * 20, multiplicacion.operar(30, 20), 0);
        assertEquals(13 * 50, multiplicacion.operar(13, 50), 0);
        assertEquals(46 * 13, multiplicacion.operar(46, 13), 0);
        assertEquals(41 * 17, multiplicacion.operar(41, 17), 0);
    }

    @Test
    public void testDivi() {
        assertEquals(30 / 20, dividir.operar(30, 20), 0);
        assertEquals(13 / 50, dividir.operar(13, 50), 0);
        assertEquals(46 / 13, dividir.operar(46, 13), 0);
        assertEquals(41 / 17, dividir.operar(41, 17), 0);
    }

}
