package Lesson2.Lab1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library lib = new Library();
        while (true) {
            System.out.println("Введите номер книги");
            int id = in.nextInt();
            System.out.println("Введите название книги");
            String name = in.next();
            System.out.println("Введите автора книги");
            String author = in.next();
            Book book1 = new Book(id, name, author);
            if (lib.addbook(book1)){
                break;
            };
        }
        lib.printBooks();
    }
}
