import java.util.Scanner;

@SuppressWarnings("ALL")
public class Lesson5 {
    public static void main(String[] args) {
        //Практическое задание 1
        //Мы вводим строку (текст) в нашу программу.
        // Программа должна определить, является ли наш текст "Палиндром"-ом или нет.
        // Палиндром - это когда текст читается так же одинаково если ее читать в обратном порядке.
//        Scanner in = new Scanner(System.in);
//        String a = in.next();
//        boolean f = true;
//        for (int i = 0; i < a.length() ; i++) {
//            if (a.charAt(i) == a.charAt(a.length() - i - 1)){
//                f = true;
//            }
//            else{
//                f = false;
//                break;
//            }
//        }
//        if (f){
//            System.out.println("Yes");
//        }else {
//            System.out.println("no");
//        }

        //2 задание Мы вводим строку (текст) в нашу программу. Программа должна вывести количество гласных букв.

//        Scanner in = new Scanner(System.in);
//
//        String a = in.next();
//        int counter = 0;
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' ||a.charAt(i) == 'u'){
//                counter++;
//            }
//        }
//        System.out.println(counter);

        //3 задание Вводим в программу две строки s1 и s2.
        // Если s2 содержится внутри слова s1, то программа выводит "Yes", иначе "No".

//        Scanner in = new Scanner(System.in);
//
//        String s1 = in.next();
//        String s2 = in.next();
//        int a = s1.indexOf(s2);
//        if (a < 0){
//            System.out.println("NO");
//        }
//        else {
//            System.out.println("Yes");
//        }
        // 4 задание Вводим строки s1 и s2 в программу.
        // Программа должна вывести "Yes", если s2 является противоположным (в обратном чтении) s1. Иначе "No".
//        Scanner in = new Scanner(System.in);
//        String s1 = in.next();
//        String s2 = in.next();
//        int g = s2.length() - 1;
//        boolean f = true;
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) == s2.charAt(g)){
//                f = true;
//            }
//            else {
//                f = false;
//                break;
//            }
//            g--;
//        }
//        if (f){
//            System.out.println("yes");
//        }
//        else {
//            System.out.println("NO");
//        }
        //Лабораторная работа 1
        //Задание 1 Напишите программу, которая преобразует все заглавные символы строки в нижний регистр.
//        Scanner in = new Scanner(System.in);
//        String s1 = in.next();
//        System.out.println(s1.toLowerCase());
        // Задание 2 Напишите программу, которая продублирует все символы введенного текста.
//        Scanner in = new Scanner(System.in);
//        String s1 = in.next();
//        for (int i = 0; i <s1.length() ; i++) {
//            System.out.print(s1.charAt(i));
//            System.out.print(s1.charAt(i));
//        }
        //Думаю у этого задания есть более корректное решение и лучше .Только я незнаю. Думал возможно надо после ввода
       // строки его перенести в массив другой строки но не получается.Может на уроке подскажете решение получше




    }
}
