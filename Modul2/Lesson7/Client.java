package Lesson7;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            Socket socket = new Socket("localhost",2000);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            System.out.println("Insert your name");
            String name = in.next();
            while (true){
                System.out.println("PRESS [1] TO SEND MESSAGE\nPRESS [2] TO EXIT");
                String number = in.next();
                if (number.equals("1")){
                    System.out.println("Insert message text:");
                    String message = in.nextLine();
                    MessageData messageda = new MessageData(name,message);
                    outputStream.writeObject(messageda);
                }
                else if (number.equals("2")){
                   break;
                }
            }
            socket.close();

        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
