package Lesson8.ЗPrak1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread{
    private Socket socket;
    private int id;

    public ClientHandler(Socket socket, int id) {
        this.socket = socket;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            PackageData data = null;
            if ((data = (PackageData)inputStream.readObject())!=null){
                ArrayList <Book>response = null;
                if (data.getOperationType().equals("List")){
                    response = data.getBooks();
                    outputStream.writeObject(response);
                }else if (data.getOperationType().equals("Add")){
                    data.setBooks(data.getBook());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
