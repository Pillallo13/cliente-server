import Operaciones.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;;

public class test {

    Operacion suma = new Suma();
    Operacion resta = new Resta();
    Operacion multiplicacion = new Multiplicar();
    Operacion dividir = new Dividir();
    Operacion[] operaciones = { suma, resta, multiplicacion, dividir };

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
}
