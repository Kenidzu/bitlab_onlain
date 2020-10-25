package Lesson8.ЗPrak1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int id = 0;
        Scanner in = new Scanner(System.in);
        try {
            Socket socket = new Socket("localhost",2040);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while (true) {
                System.out.println("PRESS 1 TO LIST BOOKS\nPRESS 2 TO ADD BOOKS\nPRESS 0 TO DISCONNECT FROM SERVER");
                int num = in.nextInt();
                if (num == 1) {
                    PackageData data = new PackageData("List",null,null);
                    ArrayList<Book>books = new ArrayList<>();
                    books = (ArrayList<Book>) inputStream.readObject();
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println(books.toString());
                    }

                } else if (num == 2) {
                    System.out.println("Insert name");
                    String name = in.next();
                    System.out.println("Insert author");
                    String author = in.next();
                    Book book1 = new Book(id, name, author);
                    id++;
                    PackageData data = new PackageData("Add",null,book1);
                    outputStream.writeObject(data);
                } else if (num == 0) {
                    System.exit(0);
                } else {
                    System.out.println("Wrong Command");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
