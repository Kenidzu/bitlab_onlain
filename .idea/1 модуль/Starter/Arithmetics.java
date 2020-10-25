import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Arithmetics {
    static void add(int a,int b){
        System.out.println(a + b);
    }
    static void sub(int a,int b){
        System.out.println(a - b);
    }
    static void mul(int a,int b){
        System.out.println(a * b);
    }
    static void div(int a,int b){
        if (b !=0){
            System.out.println(a / b);
        }
        else {
            System.out.println("Деление на ноль запрещено");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String c = in.next();
        switch (c){
            case "+":
                add(a,b);
                break;
            case "-":
                sub(a,b);
                break;
            case "*":
                mul(a,b);
                break;
            case "/":
                div(a,b);
                break;
            default:
                System.out.println("Знак ввели неккоректный");
        }
    }
}
