package Lesson3.Lab1;

import java.util.ArrayList;

public class BankApplication {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public BankApplication() {
    }

    public BankApplication(String name, ArrayList<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAccount(Account a){
        accounts.add(a);
    }
    public void removeAccount(int i){
        accounts.remove(i);
    }
    public  Account getMaxAccount(){
        double max = 0;
        int index = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (max<accounts.get(i).getBalance()){
                max = accounts.get(i).getBalance();
                index = i;
            }
        }
        return accounts.get(index);
    }

    public double getAverageBalance(){
        double sum = 0;
        int index = 0;
        for (int i = 0; i < accounts.size(); i++) {
            sum += accounts.get(i).getBalance();
            index++;
        }
        return (sum/index);
    }

    public double getTotalBalance(){
        double sum = 0;
        for (int i = 0; i < accounts.size(); i++) {
            sum += accounts.get(i).getBalance();
        }
        return sum;
    }

    public int totalAccounts(){
        int index = 0;
        for (Account account : accounts) {
            index++;
        }
        return index;
    }

    public String getBankData(){
        return getName() + "\t" + totalAccounts() + "\t " + getTotalBalance() + " \t" + getAverageBalance();
    }

}
