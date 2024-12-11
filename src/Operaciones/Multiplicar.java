package Operaciones;

public class Multiplicar implements Operacion{
    @Override
    public int operar(int a, int b) {
        return a * b;
    }
    @Override
    public float operar(float a, float b) {
        return a * b;
    }
    @Override
    public double operar(double a, double b) {
        return a * b;
    }
}
