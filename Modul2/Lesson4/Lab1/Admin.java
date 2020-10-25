package Lesson4.Lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {




    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("PRESS [1] ADD GOOD\nPRESS [2] LIST GOODS\nPRESS [3] DELETE GOOD\nPRESS [0] TO EXIT");
            int chislo = in.nextInt();
            if (chislo == 1){
                System.out.println("Inser name food");
                String name = in.next();
                System.out.println("Inser price food");
                int price = in.nextInt();
                GoodItem food = new GoodItem(name,price);
                ArrayList<GoodItem> goodItems = getGoodItemList();
                goodItems.add(food);
                saveGoodItems(goodItems);
            }
            else if (chislo == 2){
                ArrayList<GoodItem> goodItems = getGoodItemList();
                for (int i = 0; i < goodItems.size(); i++) {
                    System.out.println((i + 1) + " " + goodItems.get(i));
                };
            }
            else if (chislo == 3){
                ArrayList<GoodItem> goodItems = getGoodItemList();
                for (int i = 0; i < goodItems.size(); i++) {
                    System.out.println((i + 1) + " " + goodItems.get(i));
                };
                System.out.println("Insert index of player to delete: ");
                int num = in.nextInt();
                goodItems.remove(num);
                saveGoodItems(goodItems);
            }
            else if (chislo == 0){
                System.exit(0);
            }
            else{
                System.out.println("Wrong command!!!");
            }
        }
    }

    public static void  deletegooditemlist(int number){
        ArrayList<GoodItem> goodItems = getGoodItemList();
        goodItems.remove(number);
        saveGoodItems(goodItems);
    }
    public static ArrayList<GoodItem> getGoodItemList(){
        ArrayList <GoodItem> food = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("gooditems.txt"));
            String name = br.readLine();
            while (!name.equals("")){
                String pr = br.readLine();
                int price = Integer.parseInt(pr);
                food.add(new GoodItem(name,price));
                name = br.readLine();
            }
        }catch (Exception e){

        }
        return food;
    }

    public static void saveGoodItems(ArrayList<GoodItem>goodItems){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("gooditems.txt"));
            for (GoodItem food: goodItems){
                bw.write(food.getName()+"\n");
                bw.write(food.getPrice()+"\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
