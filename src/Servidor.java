import java.net.*;
import java.io.*;

public class Servidor {
    ServerSocket socketServidor = null;
    Socket socketCliente = null;
    DataInputStream in =  null;

    public Servidor(int puerto) {

        try {
            socketServidor = new ServerSocket(puerto);
            System.out.println("Servidor escuchando...");
            socketCliente = socketServidor.accept();
            in = new DataInputStream(new BufferedInputStream(socketCliente.getInputStream()));
            System.out.println("Servidor conectado con un cliente");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void imprimir() {
        try {
            String line = in.readUTF();
            while(!line.equals("exit")) {
                System.out.println("Cliente dice : " + line);
                line = in.readUTF();

            }
            in.close();
            System.out.println("El cliente ha cerrado la conexion...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void cerrar() {
        try {
            socketServidor.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {
        Servidor servidor = new Servidor(1234);
        servidor.imprimir();
        servidor.cerrar();

    }
}
