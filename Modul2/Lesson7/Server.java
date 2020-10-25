package Lesson7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(2000);
            System.out.println("Waiting client");
            Socket socket1 = server.accept();
            System.out.println("Client connected");
            ObjectOutputStream outputStream = new ObjectOutputStream(socket1.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket1.getInputStream());
            MessageData message = new MessageData();
            while ((message = (MessageData) inputStream.readObject())!=null ){
                System.out.println(message.toString());
            }
            ArrayList<Client> cl = new ArrayList<>();



            inputStream.close();
            outputStream.close();
            socket1.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
