public class suma {

    String message;

    public void add(int a, int b) {
        message = "La suma de " + a + " + " + b + " es: " + (a + b);
    }
    public String sendMessage() {
        return message;
    }
    
}
