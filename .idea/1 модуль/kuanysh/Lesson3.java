import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        //Практическое задание #1
        //Задание 1 - Введите в программу число n.
        //Программа должна вывести квадраты чисел от 1 до n.
//        Scanner in = new Scanner(System.in);
//        int n =  in.nextInt();
//        int sum;
//        for (int i = 1; i <  n ; i++) {
//            System.out.println(i + " " + i*i);
//        }

        // Задание 2 - Напишите программу, в которой я ввожу числа a и b.
        // Программа должна вывести мне умножение этих двух чисел.
        // (Не используйте оператор умножения *, вместо этого - цикл.)

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int rezult = 0;
//        for (int i = 0; i < b; i++) {
//            rezult += a;
//        }
//        System.out.println(rezult);

        // 3 задание - Вводим число a и b. Программа должна вывести таблицу степени an, где n это числа которые идут от 0 до b.
        //*Подсказка: Вы можете использовать метод Math.pow(). Пример: Math.pow(3,2) = 9
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        for (int i = 0; i < b; i++) {
//            int c = (int) Math.pow(a, i);
//            System.out.println(i + " " + c);
//        }

        // 4 задание - Напишите программу, которая запрашивает числа. Программа должна остановиться запрашивать,
        // когда мы вводим 0.
        //Программа должна вывести количество введенных чисел и среднее значение.
//        Scanner in = new Scanner(System.in);
//        int counter = 0;
//        double sum = 0;
//
//        while (true){
//            int a = in.nextInt();
//            if (a == 0){
//                break;
//            }
//            counter++;
//            sum += a;
//        }
//        System.out.println(counter + " " + sum/counter);

        //5 задание - Напишите программу, которая запрашивает числа.
        // Программа должна остановиться запрашивать, когда мы вводим 0.
        //Программа должна вывести максимальное значение из всех чисел.
//        Scanner in = new Scanner(System.in);
//        int max = 0;
//        while (true){
//            int a = in.nextInt();
//            if (a == 0 ){
//                break;
//            }
//            if (max <a ) {
//                max = a;
//            }
//        }
//        System.out.println(max);

        //6 задание - Вводим число n. Программа должна вывести сумму первых n чисел от последовательности 1,3,5,7...
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int sum = 0;
//        for (int i = 1; i <n*2 ; i+=2) {
//            sum += i;
//        }
//        System.out.println(sum);

        //Лабораторная задание №1
        // 1 задание - Напишите программу, в которой я ввожу число n.
        // Программа должна вывести умножение первых n чисел. 1*2*3*4*5...n
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int sum = 1;
//        for (int i = 1; i <= a; i++) {
//            sum *= i;
//        }
//        System.out.println(sum);

        //2 задание - Напишите программу, которая запрашивает числа. Программа должна остановиться запрашивать,
        // когда мы вводим 0.
        //Программа должна вывести умножение всех введенных чисел.

//        Scanner in = new Scanner(System.in);
//        double sum=1;
//        while (true){
//            double a = in.nextDouble();
//            if (a == 0){
//                break;
//            }
//            sum *= a;
//        }
//        System.out.println(sum);

        //3 задание - Напишите программу, которая запрашивает числа.
        // Программа должна остановиться запрашивать, когда мы вводим 0.
        //Программа должна вывести сумму нечетных элементов, которые мы вводили.
//        Scanner in = new Scanner(System.in);
//        int sum = 0;
//        while (true){
//            int a = in.nextInt();
//            if (a == 0) {
//                break;
//            }
//            if (a % 2 !=0){
//                sum += a;
//            }
//        }
//        System.out.println(sum);

        //4 задание Программа запрашивает число n.
        // Программа должна вывести сумму первых n чисел в последовательности 1+1/2+1/3+1/4 …

//        Scanner in = new Scanner(System.in);
//        double n = in.nextDouble();
//        int sum = 0;
//        for (int i = 1; i < n; i++) {
//            sum += 1.0/i;
//        }
//        System.out.println(sum);
        // не понял смысл задачи

        // 5 задание
        //Вводим число a и b. Программа должна вывести ab не используя математические операторы степени. Используйте цикл.

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int sum = 1;
//        for (int i = 0; i < b; i++) {
//            sum *= a;
//        }
//        System.out.println(sum);

        // Лабораторная работа №2
        //1 задание - Выведите все натуральные делители числа x в порядке возрастания (включая 1 и само число)
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        for (int i = 1; i <= a; i++) {
//            if (a % i ==0){
//                System.out.println(i + " ");
//            }
//        }

        //2 задание
        //Вводятся 4 числа: a, b, c и d. Выведите все числа на отрезке от a до b,
        // дающие остаток c при делении на d. Если таких чисел не существует, то ничего выводить не нужно.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int d = in.nextInt();
//        for (int i = a; i <= b; i++) {
//            if (i % d == c){
//                System.out.println(i);
//            }
//        }

        //3 задание Напишите программу, которая запрашивает числа.
        // Программа должна остановиться запрашивать, когда мы вводим 0.
        //Программа должна вывести количество введенных чисел и среднее значение.
//        Scanner in = new Scanner(System.in);
//        int counter = 0;
//        double sum = 0;
//        while (true){
//            int a = in.nextInt();
//            if (a == 0){
//                break;
//            }
//            counter++;
//            sum += a;
//        }
//        System.out.println(counter);
//        System.out.println(sum / counter);

        //4 задание Напишите программу, которая запрашивает числа.
        // Программа должна остановиться запрашивать, когда мы вводим 0.
        //Программа должна вывести максимальное значение из всех чисел.

//        Scanner in = new Scanner(System.in);
//        int max = 0;
//        while (true){
//            int a = in.nextInt();
//            if (a == 0){
//                break;
//            }
//            if (max < a){
//                max = a;
//            }
//        }
//        System.out.println(max);

        //5 задание - Напишите программу, вычисляющую 2n.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int sum = 2;
//        for (int i = 1; i < a; i++) {
//            sum *= 2;
//        }
//        System.out.println(sum);

        //6 задание По данному натуральному n вычислите сумму  12 + 22 + ... + n2.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= a; i++) {
//            sum = sum + (i * i);
//        }
//        System.out.println(sum);

        //7 задание Дано натуральное число N. Напишите программу, вычисляющую сумму цифр числа N.
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int sum = 0;
//        while (true){
//            sum =sum + ( n % 10);
//            n = n /10;
//            if (n == 0 ){
//                break;
//            }
//        }
//        System.out.println(sum);

        //8 задание Вводятся 4 числа: a,b,c и d.
        // Найдите все целые решения уравнения ax3 + bx2 + cx + d = 0 на отрезке [0,1000] и выведите их в порядке возрастания.
        // Если на данном отрезке нет ни одного решения, то ничего выводить не нужно. (выведите значение x)
//         Scanner in = new Scanner(System.in);
//         int a = in.nextInt();
//         int b = in.nextInt();
//         int c = in.nextInt();
//         int d = in.nextInt();
//        for (int x = 0; x < 1000 ; x++) {
//            if ((a * (Math.pow(x,3)))+ (b * (Math.pow(x,2))) + (c * x) + d == 0){
//                System.out.println(x);
//            }
//        }

        //9 задание Петя любит счастливые числа.
        // Всем известно, что счастливыми являются положительные целые числа, в десятичной записи
        // которых содержатся только счастливые цифры 4 и 7. Например, числа 47, 744, 4 являются счастливыми,
        // а 5, 17, 467 — не являются.
        //К сожалению, не все числа счастливые.
        // Петя называет число почти счастливым, если количество счастливых цифр в нем — счастливое число.
        // Ему интересно, является ли число n почти счастливым.
        //В единственной строке задано целое число n (1≤n≤1018).
        //В единственной строке выведите «YES», если число n — почти счастливое, и «NO» в противном случае (без кавычек).
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int d = 0;
//        int g = 0;
//        int h = a;
//        boolean f = false;
//        for (int i = 1; i <= a ; i++) {
//            int c = i;
//            while (true){
//                g = h % 10;
//                if (g == 4 || g == 7) {
//                    c = c / 10;
//                    d++;
//                    if (c == 0) {
//                        if (d == 4 || d == 7) {
//                            System.out.println("Yes");
//                            f = true;
//                            break;
//                        } else {
//                            d = 0;
//                            break;
//                        }
//                    }
//                }else if (g!=4 || g!=7){
//                    break;
//                }
//                h = h / 10;
//            }
//            h = a;
//            if (f == true){
//                break;
//            }
//        }
//        if (f == false){
//            System.out.println("No");
//        }

        // 10 задание Солдат хочет купить w бананов в магазине.
        // Ему надо заплатить k долларов за первый банан, 2k долларов — за второй и так далее
        // (иными словами, за i-й банан надо заплатить i·k долларов).
        //У него есть n долларов. Сколько долларов ему придется одолжить у однополчанина, чтобы купить w бананов?
        //В первой строке записано три положительных целых числа k,n,w (1≤k,w≤1000, 0≤n≤109),
        // стоимость первого банана, изначальное количество долларов у солдата и количество бананов, которые он хочет купить.
        //Выведите единственное целое число — количество долларов, которое солдату надо одолжить у однополчанина.
        // Если деньги одалживать не надо, выведите 0.
//        Scanner in = new Scanner(System.in);
//        int k = in.nextInt();
//        int n = in.nextInt();
//        int w = in.nextInt();
//        int sum = 0;
//        int y = 0;
//        for (int i = 0; i <= w; i++) {
//            sum = sum + (i * k);
//
//        }
//        if (sum > n){
//            y = sum - n;
//            System.out.println(y);
//        }
//        else if (sum < n){
//            System.out.println("Ничего одолживать не надо");
//        }
    }
}
