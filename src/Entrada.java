import java.util.Scanner;
public class Entrada {

    Scanner scanner = new Scanner(System.in);
    String message = "";

    public void getMessages() {
        //System.out.println("Type exit to stop sending messages to serve");
        message = scanner.nextLine();
        this.sendMessage();
    }

    public String sendMessage() {
        return message;
    }

}
