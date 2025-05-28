Server.java
=-----------
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started. Waiting for client...");
        Socket socket = serverSocket.accept();

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String clientMsg, serverMsg;

        while ((clientMsg = input.readLine()) != null) {
            System.out.println("Client: " + clientMsg);
            serverMsg = keyboard.readLine();
            output.println(serverMsg);
        }

        socket.close();
        serverSocket.close();
    }
}
Client.java
-------------
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String serverMsg, clientMsg;

        while (true) {
            clientMsg = keyboard.readLine();
            output.println(clientMsg);
            serverMsg = input.readLine();
            System.out.println("Server: " + serverMsg);
        }
    }
}
