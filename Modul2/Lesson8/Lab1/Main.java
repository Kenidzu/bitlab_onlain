package Lesson8.Lab1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Main {
    public static Socket socket;
    public static boolean var = false;
    public static ObjectOutputStream outputStream;

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);

    }

    public static boolean connect(String id,int port) {

        try {
            socket = new Socket(id,port);
            outputStream = new ObjectOutputStream(socket.getOutputStream());
            var = true;

        }catch (Exception e){

            var = false;
        }
        return var;
    }

    public static void addserver(String text){
        try {
            outputStream.writeObject(text);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
