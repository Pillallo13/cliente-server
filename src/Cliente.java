
import java.io.*;
import java.net.*;

public class Cliente {

    Socket socket = null;
    DataOutputStream out = null;
    Entrada entrada = null;

    public Cliente(String direccion, int puerto) {

        try {
            socket = new Socket(direccion, puerto);
            out = new DataOutputStream(socket.getOutputStream());
            entrada = new Entrada();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void escribir() {
        try {
            while (!entrada.message.equals("exit")) {
            entrada.getMessages();
            out.writeUTF(entrada.message);}
            out.close();
            this.cerrar();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public void cerrar() {
        try {
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("127.0.0.1", 1234);
        cliente.escribir();
    }
}
