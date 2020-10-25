package Lesson4.Lab1;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Client {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("PRESS [1] LIST GOODS\nPRESS [2] BUY GOOD\nPRESS [3] LIST BUY HISTORY\nPRESS [0] TO EXIT");
            int num = in.nextInt();
            if (num ==1){
                ArrayList <GoodItem> goodItems = getGoodItemLis();
                for (int i = 0; i < goodItems.size(); i++) {
                    System.out.println((i + 1) + " " + goodItems.get(i));
                }
            }
            else if (num ==2){
                System.out.println("Введите номер продукта");
                int number = in.nextInt();
                ArrayList<GoodItem> goodItems = getGoodItemLis();
                String goodName = goodItems.get(number - 1).getName();
                int goodprice = goodItems.get(number - 1).getPrice();
                BuyHistory buy = new BuyHistory(goodName,goodprice);
                ArrayList<BuyHistory> buyHistories = getBuyHistory();
                buyHistories.add(buy);
                saveBuyHistiry(buyHistories);
                Admin.deletegooditemlist(number - 1);
            }
            else if (num ==3){
                ArrayList<BuyHistory> buyHistories = getBuyHistory();
                for (int i = 0; i < buyHistories.size() ; i++) {
                    System.out.println((i + 1) + " " + buyHistories.get(i));
                }
            }
            else if (num ==0){
                System.exit(0);
            }
            else {
                System.out.println("Wrong command!!!");
            }
        }
    }

    public static ArrayList<GoodItem> getGoodItemLis(){
        ArrayList <GoodItem> goodItems = Admin.getGoodItemList();
        return goodItems;
    }

    public static ArrayList<BuyHistory> getBuyHistory(){
        ArrayList<BuyHistory> buyHistories = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("buyHistory.txt"));
            String goodname = br.readLine();
            while (!goodname.equals("")){
                String pr = br.readLine();
                int goodprice = Integer.parseInt(pr);
                buyHistories.add(new BuyHistory(goodname,goodprice));
                String time = br.readLine();
                goodname = br.readLine();
            }

        }catch (Exception e){

        }
        return  buyHistories;
    }
    public static void saveBuyHistiry(ArrayList<BuyHistory> buyHistorys){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("buyHistory.txt"));
            for (BuyHistory buy: buyHistorys){
                bw.write(buy.getGoodName() + "\n");
                bw.write(buy.getGoodPrice() + "\n");
                bw.write(buy.getBuyTime() + "\n");
            }
            bw.close();
        }catch (Exception e){

        }
    }
}
