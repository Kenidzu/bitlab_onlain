package Lesson3.Lab1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> evraz = new ArrayList<>();
        ArrayList<Account> kaspi = new ArrayList<>();
        ArrayList<Account> halyk = new ArrayList<>();

        Account account1 = new Account(1,"Kuanysh","Zhumayev",245000.37);
        Account account2 = new Account(2,"Azamat","Zhuma",152345.12);
        Account account3 = new Account(3,"Leo","Messi",212023.21);
        Account account4 = new Account(4,"Kristiano","Ronaldo",152345.12);
        Account account5 = new Account(5,"Gerrad","Seka",330000.25);
        Account account6 = new Account(6,"Luka","Modric",185302.00);
        Account account7 = new Account(7,"Frank","Ribery",212343.37);
        Account account8 = new Account(8,"Robert","LEWA",223019.16);
        Account account9 = new Account(9,"Manuel","Neuer",182032.76);
        Account account10 = new Account(10,"Toni","Kroos",123631.78);
        evraz.add(account1);
        evraz.add(account2);
        evraz.add(account3);
        halyk.add(account4);
        halyk.add(account5);
        halyk.add(account6);
        kaspi.add(account7);
        kaspi.add(account8);
        kaspi.add(account9);
        kaspi.add(account10);
        BankApplication bank1 = new BankApplication("Evraz",evraz);
        BankApplication bank2 = new BankApplication("Kaspi",kaspi);
        BankApplication bank3 = new BankApplication("Halyk",halyk);
        ArrayList<BankApplication> allbanks = new ArrayList<>();
        allbanks.add(bank1);
        allbanks.add(bank2);
        allbanks.add(bank3);


        double sum0 = allbanks.get(0).getAverageBalance();
        double sum1 = allbanks.get(1).getAverageBalance();
        double sum2 = allbanks.get(2).getAverageBalance();
        if (sum0 < sum1 && sum1 < sum2){
            System.out.println(allbanks.get(2).getBankData());
            System.out.println(allbanks.get(1).getBankData());
            System.out.println(allbanks.get(0).getBankData());
        }
        else if (sum1 < sum0 && sum0 < sum2){
            System.out.println(allbanks.get(2).getBankData());
            System.out.println(allbanks.get(0).getBankData());
            System.out.println(allbanks.get(1).getBankData());
        }
        else if (sum0 < sum2 && sum2 < sum1){
            System.out.println(allbanks.get(1).getBankData());
            System.out.println(allbanks.get(2).getBankData());
            System.out.println(allbanks.get(0).getBankData());
        }
        else if (sum2 < sum0 && sum0 < sum1){
            System.out.println(allbanks.get(1).getBankData());
            System.out.println(allbanks.get(0).getBankData());
            System.out.println(allbanks.get(2).getBankData());
        }
        else if (sum2 < sum1 && sum1 < sum0){
            System.out.println(allbanks.get(0).getBankData());
            System.out.println(allbanks.get(1).getBankData());
            System.out.println(allbanks.get(2).getBankData());
        }
        else if (sum1 < sum2 && sum2 < sum0){
            System.out.println(allbanks.get(0).getBankData());
            System.out.println(allbanks.get(2).getBankData());
            System.out.println(allbanks.get(1).getBankData());
        }

    }
}
