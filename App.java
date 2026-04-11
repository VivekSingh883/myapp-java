import java.io.*;
import java.net.*;

public class App {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(3000);
        System.out.println("Server started on port 3000");

        while (true) {
            Socket client = server.accept();
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: text/plain");
            out.println();
            out.println("Hello DevOps Practical 1 🚀 (Java)");

            client.close();
        }
    }
}