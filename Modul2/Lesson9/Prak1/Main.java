package Lesson9.Prak1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DBmanager dbManager1 = new DBmanager();
        dbManager1.connect();

        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("PRESS [1] TO ADD ITEMS\nPRESS [2] TO LIST ITEMS\nPRESS [3] TO DELETE ITEMS\nPRESS [0] TO EXIT");
            int number =  in.nextInt();
            if (number == 1){
                System.out.println("Insrt id");
                long id = in.nextLong();
                System.out.println("Insert name:");
                String name = in.next();
                System.out.println("Insert price:");
                double price = in.nextDouble();
                Item it = new Item(name,price);
                dbManager1.addItem(it);
            }
            else if (number == 2){
                ArrayList<Item>items = dbManager1.getAllItem();
                for (Item i : items){
                    System.out.println(items.toString());
                }
            }
            else if (number == 3){
                System.out.println("Insert id");
                Long id = in.nextLong();
                dbManager1.deleteitems(id);
            }
            else if (number == 0){
                dbManager1.disconnect();
                System.exit(0);
            }
        }
    }
}
