public class Suma {

    public boolean esNumero(Object obj) {
        return (obj instanceof Number);
    }

    public int sumar(int a, int b) {
        if (this.esNumero(a) == true && this.esNumero(b) == true) {
            return a + b;
        } else {
            return 0;
        }
    }

}
