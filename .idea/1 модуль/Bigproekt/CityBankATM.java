import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CityBankATM {
    Database all  = new Database();
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер счета");
        String chet = in.next();
        System.out.println("Введите пин - код");
        String pin = in.next();
        boolean f = true;
        boolean exit = false;
        for (int i = 0; i < Database.allAccounts.length; i++) {
            if (chet.equals(Database.allAccounts[i].getAccountNumber())){
                f = false;
                if (pin.equals(Database.allAccounts[i].getPinCode())){
                    if (Database.allAccounts[i].nameBank().equals("City")){
                        while (true) {
                            System.out.println("PRESS [1] TO CASH WITHDRAWAL\nPRESS [2] TO VIEW BALANCE\n PRESS [3] TO CHANGE PIN CODE" +
                                    "\nPRESS [4] TO CASH IN ACCOUNT\nPRESS [5] TO VIEW ACCOUNT DATA\nPRESS [6] TO EXIT");
                            int citycash = in.nextInt();
                            if (citycash == 1){
                                System.out.println("Введите сумму для снятия");
                                int money = in.nextInt();
                                if (money < Database.allAccounts[i].totalBalance()){
                                    System.out.println("Ваша сумма снята");
                                    Database.allAccounts[i].creditBalance(money);
                                }
                                else {
                                    System.out.println("Запрашиваемая сумма превышает остаток денег на карте");
                                }
                            }
                            else if (citycash == 2){
                                System.out.println("Ваш баланс равен" + Database.allAccounts[i].totalBalance());
                            }
                            else if (citycash == 3){
                                System.out.println("Введите ваш новый пин-код");
                                String newpin = in.next();
                                Database.allAccounts[i].setPinCode(newpin);
                            }
                            else if (citycash == 4){
                                System.out.println("Введите сумма для добавления на карту");
                                int incash = in.nextInt();
                                Database.allAccounts[i].debetBalance(incash);
                            }
                            else if (citycash == 5){
                                System.out.println("Ваши данные следующие");
                                System.out.println(Database.allAccounts[i].accountData());
                            }
                            else if (citycash == 6){
                                System.out.println("Exit");
                                exit = true;
                                break;
                            }
                            else {
                                System.out.println("Введено неправильное значение.Введите заново");
                            }
                        }
                    }
                    else if (Database.allAccounts[i].nameBank().equals("National")){
                        while (true){
                            System.out.println("PRESS [1] TO CASH WITHDRAWAL\nPRESS [2] TO VIEW BALANCE\nPRESS [3] TO EXIT");
                            int nati = in.nextInt();
                            if (nati == 1){
                                System.out.println("Введите сумму для снятия");
                                int cashmoney = in.nextInt();
                                Database.allAccounts[i].creditBalance(cashmoney);
                            }
                            else if (nati == 2){
                                System.out.println("Ваша баланс равен " + Database.allAccounts[i].totalBalance());
                            }
                            else if (nati == 3){
                                System.out.println("Exit");
                                exit = true;
                                break;
                            }
                        }
                    }
                }
                else {
                    System.out.println("Номер пин-кода введен неправильно.Заберите карточку");
                    break;
                }
            }
            if (exit){
                break;
            }
        }
        if (f){
            System.out.println("Номер счета неверено.Выньте карточку и вставьте заново");
        }
    }
}
