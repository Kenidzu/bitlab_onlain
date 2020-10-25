import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //Лабораторная работа 1.Задание 1
//        Car s1 = new Car("Lastochka","Audi",180,1300);
//        Car s2 = new Car("Deva","Porshe",220,2400);
//        Car s3 = new Car("Krasavisa","Mersedes",250,1900);
//        Car s4 = new Car("Zhan","gelen",260,2100);
//        Car s5 = new Car("serdse","Toyota",150,3200);
//        Car s6 [] = new Car[]{s1,s2,s3,s4,s5};
//        for (int i = 0; i < s6.length; i++) {
//            s6[i].ride();
//        }

        //Задание 2
//        Enguine a1 = new Enguine("Gk - 330",250,500,480);
//        Enguine a2 = new Enguine("Go - 520",330,450,540);
//        Enguine a3 = new Enguine("Dik - 230",180,330,630);
//        Car s1 = new Car("Lastochka","Audi",180,1300,a1);
//        Car s2 = new Car("Deva","Porshe",220,2400,a2);
//        Car s3 = new Car("Krasavisa","Mersedes",250,1900,a1);
//        Car s4 = new Car("Zhan","gelen",260,2100,a3);
//        Car s5 = new Car("serdse","Toyota",150,3200,a3);
//        Car s6 [] = new Car[]{s1,s2,s3,s4,s5};
//        for (int i = 0; i < s6.length; i++) {
//            s6[i].ride();
//        }

        //Задание №3
//        CPU cash1 = new CPU(500,13000,250);
//        CPU cash2 = new CPU(700,15000,500);
//        HDD memory1 = new HDD(500,25000,1500);
//        HDD memory2 = new HDD(700,32000,2200);
//        CPU cash3[] = new CPU[]{cash1,cash2};
//        CPU cash4[] = new CPU[]{cash1,cash2,cash1,cash1};
//        CPU cash5[] = new CPU[]{cash2,cash1,cash2,cash2,cash1,cash2,cash1,cash2};
//        Laptop nout1 = new Laptop("Lenovo",135000,2500,memory1,cash3);
//        Laptop nout2 = new Laptop("Acer",180000,3100,memory1,cash3);
//        Laptop nout3 = new Laptop("HP",190000,2250,memory2,cash4);
//        Laptop nout4 = new Laptop("Asus",220000,2400,memory2,cash4);
//        Laptop nout5 = new Laptop("Dell",230000,1500,memory2,cash5);
//        Laptop nout6 = new Laptop("Macbook",280000,3200,memory2,cash5);
//        Laptop all[] = new Laptop[]{nout1,nout2,nout3,nout4,nout5,nout6};
//        int sum = 0;
//        for (int i = 0; i < all.length; i++) {
//            System.out.println("Общая сумма компьютера " + all[i].name + " Составляет " + all[i].getTotalprice());
//            System.out.println("Общая память компьютера " + all[i].name + " Составляет " + all[i].getTotalCPUmemory());
//            System.out.println("Общий вес " + all[i].name + " Составляет " + all[i].getTotalWeight());
//        }
        //4 задание
//        User a1 = new User (1,"Kenidzu","Apple","Admin");
//        User a2 = new User (2,"Venom","Alma","Admin");
//        User a3 = new User (3,"Spider","Luk","Polsovatel");
//        User a4 = new User(4,"Luks","Haidi","Polzak");
//        User a5 [] = new User[]{a1,a2,a3,a4};
//        for (int i = 0; i < a5.length; i++) {
//            System.out.println(a5[i].getLogin());
//        }

        //5 задание
//        User a1 = new User (1,"Kenidzu","Apple","Admin");
//        User a2 = new User (2,"Venom","Alma","Admin");
//        User a3 = new User (3,"Spider","Luk","Polzak");
//        User a4 = new User(4,"Luks","Haidi","Polzak");
//        User a5 = new User(5,"Ilyas","Mila","Admin");
//        User a6 = new User(6,"Rustam","Faizulin","Polzak");
//        User a7 = new User(7,"Kamil","Ushur","Admin");
//        User a8 = new User(8,"Karina","Kanaeva","Polzak");
//        User a9 = new User(9,"Kuanysh","Kuna","Admin");
//        User a10 = new User(10,"Asel","Parol","Polzak");
//        User all[] = new User[]{a1,a2,a3,a4,a5,a6,a7,a8,a9,a10};
//        Scanner in = new Scanner(System.in);
//        while(true) {
//            System.out.println("Insert login");
//            String login = in.next();
//            System.out.println("Insert password");
//            String password = in.next();
//            boolean f = true;
//            boolean exit = false;
//            for (int i = 0; i < all.length; i++) {
//                if (login.equals(all[i].getLogin())) {
//                    f = false;
//                    if (password.equals(all[i].getPassword())) {
//                        System.out.println("Welcome " + all[i].getLogin());
//                        vivod();
//                        int h = chislo();
//                        if (h == 1){
//                            break;
//                        }
//                        else if(h == 2){
//                            System.out.println("Insert password");
//                            String oldpass = in.next();
//                            System.out.println("Insert new password");
//                            String newpass = in.next();
//                            System.out.println("Re-Insert new password");
//                            String renewpass = in.next();
//                            if (oldpass.equals(all[i].getPassword())){
//                                if (newpass.equals(renewpass)){
//                                    all[i].setPassword(newpass);
//                                    System.out.println("Complete");
//                                }
//                                else if(!newpass.equals(renewpass)){
//                                    System.out.println("newpass don't correct");
//                                }
//                            }
//                            else if (oldpass != all[i].getPassword()) {
//                                System.out.println("Old password don't correct");
//                                break;
//                            }
//                        }
//                        else if (h == 3){
//                            for (int j = 0; j < all.length; j++) {
//                                System.out.println(all[j].toString());
//                            }
//                        }
//                        else if (h == 0){
//                            exit = true;
//                            break;
//                        }
//                        else{
//                            System.out.println("Неккоректно ввели число");
//                            break;
//                        }
//                    }
//                    else{
//                        System.out.println("Password don't correct");
//                        break;
//                    }
//                }
//            }
//            if (f){
//                System.out.println("Login don't correct");
//            }
//            if (exit){
//                break;
//            }
//        }
//    }
//    public static void vivod(){
//        System.out.println("PRESS [1] TO EDIT LOGIN PRESS\n " +
//                "[2] TO CHANGE PASSWORD PRESS\n " +
//                "[3] TO LIST USERS PRESS\n" +
//                "[0] TO EXIT");
//    }
//    public static int chislo(){
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        return a;
//    }

        //6 задание
//        Book book1 = new Book("Garri","Tolkien",10,17000);
//        Book book2 = new Book("vlastelin","Tolkien",16,10000);
//        Book book3 = new Book("Vlastelin2","Tolkien",11,25000);
//        Book book4 = new Book("Garry2","Rouling",5,12000);
//        Book book5 = new Book("Uznik" ,"Rouling",6,18000);
//        Book book6 = new Book("Pobeg","Berton",8,7000);
//        Book book7 = new Book("Voina i mir","Tolstoi",9,23000);
//        Book book8 = new Book("Gordost","Lermontov",19,18000);
//        Book book9 = new Book("Legkie","Serpov",25,3500);
//        Book book10 = new Book("Slimper","Selin",37,4700);
//        Library books = new Library("Library1","Apple");
//        Library books2 = new Library("Library2","Moscow");
//        books.addBook(book1);
//        books.addBook(book2);
//        books.addBook(book3);
//        books.addBook(book4);
//        books2.addBook(book5);
//        books2.addBook(book6);
//        books2.addBook(book7);
//        books2.addBook(book8);
//        books2.addBook(book9);
//        books2.addBook(book10);
//        System.out.println(books.priceSum());
//        System.out.println(books2.priceSum());
//        int sum = books.priceSum() + books2.priceSum();
//        System.out.println(sum);
    }
}
