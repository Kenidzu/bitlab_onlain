import java.sql.Struct;
import java.util.Scanner;

public class NumberCheck {
    static String pol (int a){
        if (a < 0){
            return "Отрицательное";
        }
        else if (a > 0){
            return "Положительное";
        }
        else {
            return "Числао равно нулю";
        }
    }
    static String pros(int a){
        int counter = 0;
        boolean f = true;
        for (int i = 1; i < a; i++) {
            if (a % i == 0){
                counter++;
            }
            if (counter == 2){
                f = false;
                break;
            }
        }
        if (f) {
            return "простое" ;
        }
        else {
            return "не простое";
        }
    }
    static String del(int a){
        if (a % 2 == 0 || a % 5 == 0 || a % 3 == 0 || a % 6 == 0 || a % 9 == 0){
            return "делится";
        }
        else {
            return " не делится ";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Введенное число " + pol(a));
        System.out.println("Данное число " + pros(a));
        System.out.println("Данное число на цифры 2, 5, 3, 6, 9 " + del(a));
    }
}
