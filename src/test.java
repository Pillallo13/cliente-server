import Operaciones.*; 
import java.io.*;
public class test {
    
    Operacion suma = new Suma();
    Operacion resta = new Resta();
    Operacion multiplicacion = new Multiplicar();
    Operacion dividir = new Dividir();    
    Operacion[] operaciones = {suma, resta, multiplicacion, dividir};
    
    
    public void sample() {

        for (Operacion operator : operaciones) {
            System.out.println(operator.operar(10, 5));
            System.out.println(operator.operar(10.5f, 5.5f));
            System.out.println(operator.operar(10.5, 5.5));
            
        }
    }
    public static void main(String[] args) {
        test lol = new test();
        lol.sample();

    }
}
