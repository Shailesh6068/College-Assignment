import java.net.*;
import java.io.*;

public class SimpleServer {
    public static void main(String [] args)throws IOException {
        //register service port to 2005
        ServerSocket s = new ServerSocket(2005);
        Socket s1 = s.accept(); //wait and accept connection
        //get the communiucaton system accosiated with the socket 
        OutputStream slout = s1.getOutputStream();
        DataOutputStream dos = new DataOutputStream(slout);
        //send a string
        dos.writeUTF("Hello World");
        //close the connection but not the server socket
        dos.close();
        slout.close();
        s1.close();
}
}