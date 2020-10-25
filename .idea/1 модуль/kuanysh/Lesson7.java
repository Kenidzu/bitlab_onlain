import javax.swing.*;
import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Lesson7 {
    //Практическое задание
    // Задание 1 - Создайте метод, который в аргументы принимает 3 значения целостных чисел, и
    // возвращает самую максимальную из них.

    //    public static int max (int a,int b,int c){
//        if ((a >= b && b >= c) || (a >= c && c >= b)){
//            return a;
//        }
//        else if ((b >= a && a >= c) || (b >= c && c >= a)){
//            return b;
//        }
//        else {
//            return c;
//        }
//    }
//}
    // 2 задание Напишите метод, который принимает строку и возвращает количество гласных букв.
//    public static int glas(String a) {
//        int counter = 0;
//        for (int i = 0; i <a.length() ; i++) {
//            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'){
//                counter++;
//            }
//        }
//        return counter;
//    }

    // 3 задание Напишите метод, который принимает в аргументах массив целостных чисел,
    // в итоге программа должна вывести количество элементов не равных 0.
//     public static void massiv(int mass []){
//         int counter = 0;
//         for (int i = 0; i < mass.length; i++) {
//             if (mass[i] != 0){
//                 counter++;
//             }
//         }
//         System.out.println(counter);
//     }

    //4 задание Создайте метод который принимает двумерный массив целостных чисел.
    // Метод должен вывести в какой строке меньше всего содержится элементов равных 0.
//    public static void massiv (int mass[][],int a,int b){
//        int min = b;
//        int stroka = 0;
//        for (int i = 0; i < a; i++) {
//            int counter = 0;
//            for (int j = 0; j < b; j++) {
//                if (mass[i][j] == 0 ){
//                    counter++;
//                }
//            }
//            if (min > counter){
//                min = counter;
//                stroka = i;
//            }
//        }
//        System.out.println(stroka);
//    }

    // 5 задание Создайте метод который принимает в аргументы двумерный массив целостных чисел,
    // в итоге метод должен вывести массив, заменив первую строку на последнюю.
//    public static void massiv(int mass[][],int a,int b){
//        int g = a - 1;
//            for (int j = 0; j < b; j++) {
//                int temp = mass[0][j];
//                mass [0][j]  =  mass [g][j];
//                mass[g][j] = temp;
//            }
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                System.out.print(mass[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

    //Лабораторная работа №1
    //Задание №1Создайте такой метод, который принимает в аргументы массив строк.
    // Метод должен выводить строки, у которых количество гласных букв больше 4.
//    public static void massiv(String mas[]){
//
//        for (int i = 0; i < mas.length; i++) {
//            int counter = 0;
//            for (int j = 0; j < mas[i].length(); j++) {
//                if (mas[i].charAt(j) == 'a' || mas[i].charAt(j) == 'e' || mas[i].charAt(j) == 'i' ||mas[i].charAt(j) == 'u' || mas[i].charAt(j) =='o'){
//                    counter++;
//                }
//            }
//            if (counter > 4){
//                System.out.println(mas[i]);
//            }
//        }
//    }
    // Задача №2Создайте такой метод, который принимает в аргументы массив целостных чисел,
    // и определенное целостное число m. Метод в итоге должен вывести те числа в массиве,
    // значение которых совпадают с их индексами и не делятся на число m.
//    public static void vivod (int mass[],int m){
//        for (int i = 0; i < mass.length; i++) {
//            if ((mass[i] == i && mass[i] % m != 0)||(mass[i] == 0 && i ==0)){
//                System.out.print(mass[i]);
//            }
//        }
//
//    }

    //Задача №3 Создайте такой метод, который в аргументы принимает две строки text, subtext.
    // Если subtext содержится в строке text, то метод возвращает "Yes", иначе "No".
//    public static void vivod (String a,String b ){
//        int g = a.indexOf(b);
//        if (g < 0){
//            System.out.println("no");
//        }
//        else {
//            System.out.println("Yes");
//        }
//    }

    //Задача №4 Создайте такой метод, который принимает в аргументы массив целостных чисел.
    // Метод должен вывести на экран уникальные элементы массива.
//    public static void vivod (int mass[]){
//        for (int i = 0; i < mass.length; i++) {
//            boolean f = true;
//            int counter = 0;
//            for (int j = 0; j < mass.length; j++) {
//                if (mass[i] == mass[j]){
//                    counter++;
//                }
//                if (counter == 2){
//                    break;
//                }
//            }
//            if (counter == 1){
//                System.out.print(mass[i]);
//            }
//        }
//    }

    // Задача 5 Создайте такой метод, который принимает в аргументы двумерный массив целостных чисел.
    // Метод должен возвращать сумму всех чисел, у которых индексы по колонке и по строке нечетные.
//    public static int vivod (int massiv[][],int n,int m){
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (i % 2 !=0 && j % 2 !=0){
//                    sum += massiv[i][j];
//                }
//            }
//        }
//        return sum;
//    }
    public static void main(String[] args) {
        //Практическое задание
        // Задание 1 - Создайте метод, который в аргументы принимает 3 значения целостных чисел, и
        // возвращает самую максимальную из них.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        System.out.println("Максимальное число это " + max(a,b,c));
//    }

        //2 задание Напишите метод, который принимает строку и возвращает количество гласных букв.
//        Scanner in = new Scanner(System.in);
//        String a = in.next();
//        System.out.println("Количество гласных букв " + glas(a));
//    }

        // 3 задание Напишите метод, который принимает в аргументах массив целостных чисел,
        // в итоге программа должна вывести количество элементов не равных 0.
//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//
//        int mass[] = new int[n];
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = in.nextInt();
//        }
//        massiv(mass);
//    }

        // 4 задание Создайте метод который принимает двумерный массив целостных чисел.
        // Метод должен вывести в какой строке меньше всего содержится элементов равных 0.
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        int mass[][] = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                mass[i][j] =  in.nextInt();
//            }
//        }
//        massiv(mass,n,m);

        // 5 задание Создайте метод который принимает в аргументы двумерный массив целостных чисел,
        // в итоге метод должен вывести массив, заменив первую строку на последнюю.
/*        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int mass[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mass[i][j] = in.nextInt();
            }
        }
        massiv(mass,n,m);*/
        //Лабораторная работа №1
        //Задание №1Создайте такой метод, который принимает в аргументы массив строк.
        // Метод должен выводить строки, у которых количество гласных букв больше 4.
//        Scanner in = new Scanner(System.in);
//        String [] mass = new String[5];
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = in.next();
//        }
//        massiv(mass);

        // Задача №2Создайте такой метод, который принимает в аргументы массив целостных чисел,
        // и определенное целостное число m. Метод в итоге должен вывести те числа в массиве,
        // значение которых совпадают с их индексами и не делятся на число m.
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int mass [] = new int[n];
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = in.nextInt();
//        }
//        int m = in.nextInt();
//        vivod(mass,m);

        //Задача №3 Создайте такой метод, который в аргументы принимает две строки text, subtext.
        // Если subtext содержится в строке text, то метод возвращает "Yes", иначе "No".

//        Scanner in = new Scanner(System.in);
//        String a = in.next();
//        String b = in.next();
//        vivod(a,b);

        //Задача №4 Создайте такой метод, который принимает в аргументы массив целостных чисел.
        // Метод должен вывести на экран уникальные элементы массива.
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int mass[] = new int[n];
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = in.nextInt();
//        }
//        vivod(mass);

        // Задача 5 Создайте такой метод, который принимает в аргументы двумерный массив целостных чисел.
        // Метод должен возвращать сумму всех чисел, у которых индексы по колонке и по строке нечетные.
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int mass[][] = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                mass[i][j] = in.nextInt();
//            }
//        }
//        int rezult = vivod(mass,n,m);
//        System.out.println(rezult);
    }
}
