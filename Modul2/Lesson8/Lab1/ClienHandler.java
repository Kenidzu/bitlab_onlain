package Lesson8.Lab1;



import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClienHandler extends Thread{

    private Socket socket;
    private int id;

    public ClienHandler() {
    }

    public ClienHandler(Socket socket, int id) {
        this.socket = socket;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while (true){
                String responce = (String) inputStream.readObject();
                System.out.println(responce);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
