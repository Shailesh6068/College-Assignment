import java.net.*;
import java.io.*;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        // Open your connection to a server, at port 1254
        Socket s1 = new Socket("10.12.1.162", 1254);

        // Get an input stream from the socket and read the input
        DataInputStream dis = new DataInputStream(s1.getInputStream());

        // Get an output stream from the socket to send data to server
        DataOutputStream dos = new DataOutputStream(s1.getOutputStream());

        // Read message from server
        String st = dis.readUTF();
        System.out.println("Received from server: " + st);

        // Send message to server
        dos.writeUTF("Hello World");

        // Close streams and socket
        dos.close();
        dis.close();
        s1.close();
    }
}
