import java.util.Scanner;

public class Calculator {
    static void calculate(int a, int b, int c){
        int sred =  (a + b + c) / 3;
        System.out.println("Среднее арифметическое число составляет " + sred);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        calculate(a,b,c);
    }
}
