import java.net.*;
import java.io.*;

public class Servidor {
    ServerSocket socketServidor = null;
    Socket socketCliente = null;
    DataInputStream in = null;
    DataOutputStream out = null;
    Suma suma = new Suma();
    int number = 0;
    int numCli = 0;

    public Servidor(int puerto) {

        try {
            socketServidor = new ServerSocket(puerto);
            System.out.println("Servidor escuchando...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void ejecucion() {
        try {
            for (int numCli = 1; numCli <= 2; numCli++) {
                socketCliente = socketServidor.accept();
                in = new DataInputStream(new BufferedInputStream(socketCliente.getInputStream()));
                out = new DataOutputStream(socketCliente.getOutputStream());
                number = 0;
                System.out.println("Servidor conectado al cliente " + numCli);

                this.notificar("Servidor: Escriba los numeros a sumar. Para finalizar escriba 0 .");
                this.imprimir(numCli);
            }
            System.out.println("maximo de clientes alcanzado\nSe cierra el servidor");
            this.cerrar();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void notificar(String notificacion) {
        try {
            out.writeUTF(notificacion);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int sumar(String line) {

        number = suma.sumar(number, Integer.parseInt(line));
        return number;
    }

    public void imprimir(int numCliente) {
        try {
            String line = "";
            while (!line.equals("0")) {
                line = in.readUTF();
                System.out.println("Cliente " + numCliente + " : " + line);
                number = suma.sumar(number, Integer.parseInt(line));
            }
            this.notificar("La suma de los numeros ingresados es: " + number);
            System.out.println("El cliente ha cerrado la conexion...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void cerrar() {
        try {
            in.close();
            out.close();
            socketServidor.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Servidor servidor = new Servidor(1234);
        servidor.ejecucion();
    }
}
