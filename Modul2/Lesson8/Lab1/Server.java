package Lesson8.Lab1;



import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(2030);
            int id = 0;
            while (true){
                Socket socket = server.accept();
                id++;
                System.out.println("Client " + id + "connected");
                ClienHandler ch = new ClienHandler(socket,id);
                ch.start();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
