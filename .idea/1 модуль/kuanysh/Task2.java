import com.sun.source.tree.SynchronizedTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Практическое задание 1
        //1 задание - Напишите программу, где ввожу число n, и если оно между 10 и 20, то программа выведет YES иначе NO.

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        if ( a >= 10 && a <=20)
//            System.out.println("Yes");
//         else
//            System.out.println("NO");

        //2 задание - Напишите программу где я ввожу сумму внесенной валюты и
        // выберу на какую валюту хочу перевести. (Курс USD – 320, EUR – 360, GBP - 420)
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите сумму внесенной валюты");
//        int a = in.nextInt();
//        System.out.println("Выберите валюту между USD ,EUR, GBP");
//        String b = in.next();
//        switch (b) {
//            case "USD":
//                System.out.println("Сумма конвертации будет " + a * 320);
//                break;
//            case "EUR":
//                System.out.println("Сумма конвертации будет " + a * 360);
//                break;
//            case "GBR":
//                System.out.println("Сумма конвертации будет " + a * 420);
//                break;
//            default:
//                System.out.println("Нет такой валюты");

        //3 задание Напишите программу, где я ввожу целостное число a и b, и если a делиться на b,
        // то программа должна вывести divisible иначе not divisible.
        //
        //*** Подсказка: Есть такой оператор %, % показывает остаток числа.
        //
        //Например, 10%4 будет равна 2, так как когда мы делим 10 на 4, остаток у нас будет 2

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        if (b != 0){
//            if (a % b == 0){
//                System.out.println("divisible");
//            }
//            else {
//                System.out.println("not divisible");
//            }
//        }
//        else {
//            System.out.println("На ноль делить нельзя");
//        }

        //4 задание Напишите программу где я ввожу логин и пароль. И если они совпадают,
        // то мы выводим Authentication completed, иначе Invalid login or password.
        //(Логин должен быть user, пароль - qwerty)
        //*** Подсказка: Сравнение строк вы делаете с помощью метода equals().
        //Например, строка name = "test"
        //name.equals("test") возвращает true
        //name.equals("other") возвращает false
//        Scanner in = new Scanner(System.in);
//        String a = in.next();
//        if (a.equals("user")){
//            String b = in.next();
//            if (b.equals("qwerty")){
//                System.out.println("Authentication completed");
//            }
//            else {
//                System.out.println("Invalid or password");
//            }
//        }
//        else {
//            System.out.println("Invalid or login");
//        }

        //5 задание Требуется определить, является ли данный год високосным. (Напомним, что год является високосным,
        // если его номер делится 4, но не делится 100, или если он делится 400.)
        // Вводится единственное число - номер года (целое, положительное, не превышает 30000).
        // Требуется вывести слово YES, если год является високосным и NO - в противном случае.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        if (a < 30000) {
//            if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
//                System.out.println("YES");
//            }else {
//                System.out.println("NO");
//            }
//        }else {
//            System.out.println("Введите число меньше 30 000");
//        }

        //6 задание Напишите программу, которая может определить вашу будущую профессию по вашим способностям.
        // Программа будет задавать несколько вопросов и примерно по ним определит кем вам нужно стать в будущем.
//        Scanner in = new Scanner(System.in);
//        System.out.println("Choose your branch:\n" + "1 - Science, 2 - Humanitarian subjects, 3 - Art, 4 - Sport:");
//        int a = in.nextInt();
//        if (a == 1){
//            System.out.println("1 - Math, 2 - Physics:");
//            int b = in.nextInt();
//            if (b == 1){
//                System.out.println("You are Financier");
//            }
//            else if (b == 2){
//                System.out.println("You are Engineer");
//            }
//            else {
//                System.out.println("Неправильный выбор числа");
//            }
//        }
//        else if(a == 2){
//            System.out.println("1 - History, 2 - Foreign Languages:");
//            int c = in.nextInt();
//            if (c == 1){
//                System.out.println("You are Historic or Diplomat  ");
//            }
//            else if (c == 2){
//                System.out.println("You are Translator");
//            }
//            else {
//                System.out.println("Неправильный выбор числа");
//            }
//        }
//        else if (a == 3){
//            System.out.println("1 - Drawing, 2 -Singing:");
//            int d = in.nextInt();
//            if (d == 1){
//                System.out.println("You are Painter or Architect");
//            }
//            else if (d == 2){
//                System.out.println("You are Singer or Tamada");
//            }
//            else {
//                System.out.println("Неправильный выбор числа");
//            }
//        }
//        else if (a == 4){
//            System.out.println("1 - Team, 2 - Individual:");
//            int g = in.nextInt();
//            if (g == 1){
//                System.out.println("You are footballer or Basketball player");
//            }
//            else if (g == 2){
//                System.out.println("You are boxer or tennis player");
//            }
//            else {
//                System.out.println("Неправильный выбор числа ");
//            }
//        }
//        else {
//            System.out.println("Неправильный выбор числа");
//        }
//

        //Домашнее задание
        //1 задание Напишите программу, где вводим два целых числа, программа должна вывести наибольшее из данных чисел.

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        if (a > b){
//            System.out.println("Наибольшее число " + a);
//        }
//        else if (a < b){
//            System.out.println("Наибольшее число " + b);
//        }
//        else {
//            System.out.println("Оба числа равны");
//        }

        //2 задание Напишите программу, где вводим три целых числа, программа должна вывести наибольшее из данных чисел.

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        if (a > b && a > c){
//            System.out.println("Наибольшее число " + a);
//        }
//        else if (b > a && b > c){
//            System.out.println("Наибольшее число " +  b);
//        }
//        else if (c > a && c > b){
//            System.out.println("Наибольшее число " + c);
//        }
//        else
//            System.out.println("Одно из ваших чисел равны");

        // 3 задание Даны три натуральных числа a, b, c, записанные в отдельных строках.
        // Определите, существует ли треугольник с такими сторонами.
        //Если треугольник существует, выведите строку YES, иначе выведите строку NO.

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        if (a !=b || a !=c){
//            System.out.println("Yes");
//        }
//        else if (b !=c){
//            System.out.println("Yes");
//        }
//        else
//            System.out.println("NO");
        //НЕсовсем смысл задачи.А как можно определить существует ли такие треугольники.Сделал как предпологаю правильно

        //4 задание В отделе работают 3 сотрудника, которые получают заработную плату в тенге.
        // Требуется определить: на сколько зарплата самого высокооплачиваемого из них отличается от самого низкооплачиваемого.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        if (a >= b && b >= c){
//            System.out.println("Разница " + (a - c));
//        }
//        else if (a >= c && c >= b){
//            System.out.println("Разница " + (a - b));
//        }
//        else if (b >= a && a >= c){
//            System.out.println("Разница " + (b - c));
//        }
//        else if (b >= c && c >= a){
//            System.out.println("Разница " + (b - a));
//        }
//        else if (c >= b && b >= a){
//            System.out.println("Разница " + (c - a));
//        }
//        else if (c >= a && a >= b){
//            System.out.println("Разница " + (c - b));
//        }
        //5 задание Требуется определить, бьет ли ладья, стоящая на клетке с указанными координатами
        // (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.
        //Вводятся четыре числа: координаты ладьи (два числа) и координаты другой фигуры (два числа),
        // каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
        //Требуется вывести слово YES, если ладья сможет побить фигуру за 1 ход и NO - в противном случае.
        //Ладья ходит по прямым линиям(горизонтальным и вертикальным)
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int d = in.nextInt();
//        if ((a >= 1 && a <= 8) && (b >=1 && b <=8) && (c >= 1 && c <=8) && (d >=1 && d <=8)){
//           if (a == c || b == d){
//               System.out.println("Yes");
//           }
//           else {
//               System.out.println("No");
//           }
//        }
//        else {
//            System.out.println("Интервал одной из цифр вышел 8 или ниже 1");
//        }

        //6 задание Требуется определить, бьет ли слон, стоящий на клетке с указанными координатами
        // (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.
        //Вводятся четыре числа: координаты слона и координаты другой фигуры. Координаты - целые числа в интервале от 1 до 8.
        //Требуется вывести слово YES, если слон способен побить фигуру за 1 ход, в противном случае вывести слово NO
        //Слон ходит по диагональным линиям
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c =in.nextInt();
//        int d = in.nextInt();
//        if ((a >= 1 && a <= 8) && (b >=1 && b <=8) && (c >= 1 && c <=8) && (d >=1 && d <=8)){
//            if (((a + b) ==(c + d)) || ((a - b) == (c - d))){
//                System.out.println("Yes");
//            }
//            else {
//                System.out.println("No");
//            }
//        }
//        else {
//            System.out.println("одно из чисел больше 8 или меньше 1");
//        }
    }
}
