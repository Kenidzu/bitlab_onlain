import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        //Практическое задание #1
        //Задание 1 Программа запрашивает число n.
        // Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
        // Выведите в конце все элементы в обратном порядке.
//           Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//
//        int [] mass = new int[n];
//
//        for (int i = 0; i < mass.length ; i++) {
//            mass[i] = in.nextInt();
//        }
//
//        for (int i = mass.length - 1; i >= 0 ; i--) {
//            System.out.print(mass[i]);
//        }

        //Задание 2 - Программа запрашивает число n.
        // Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
        // Программа должна вывести сумму и среднее значение введенных чисел.

//       Scanner in = new Scanner(System.in);
//       int n = in.nextInt();
//       int sum = 0;
//
//       int[]mass = new int[n];
//       for (int i = 0; i < mass.length; i++) {
//            mass[i] = in.nextInt();
//            sum += mass[i];
//       }
//        int sred = sum / n;
//        System.out.println(sum);
//        System.out.println(sred);
//

        //3 задание  - Программа запрашивает число n.
        // Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
        // Программа должна вывести максимальное и минимальное значение в массиве.
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int [] mass = new int[n];
//
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = in.nextInt();
//        }
//        int max = mass[0];
//        int min = mass[0];
//
//        for (int i = 0; i < mass.length ; i++) {
//            if (max < mass[i]){
//                max = mass[i];
//            } else if (min > mass[i]){
//                min = mass[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);

        //4 задание Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
        // Программа должна вывести сумму и среднее значение исключая максимальное и минимальное значение.
//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//        int []mass = new int[n];
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = in.nextInt();
//        }
//        int sum = 0;
//        int max = mass[0];
//        int min = mass[0];
//
//        for (int i = 0; i < mass.length; i++) {
//            if (max < mass[i]){
//                max = mass[i];
//            }else if (min > mass[i]){
//                min = mass[i];
//            }
//        }
//
//        for (int i = 0; i < mass.length; i++) {
//            if (max == mass[i] || min == mass[i]){
//                continue;
//            }else {
//                sum += mass[i];
//            }
//        }
//        System.out.println(sum);

        //5 задание - Программа запрашивает число n.
        // Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
        // Далее, программа запрашивает пользователя число m.
        // Если число m существует в нашем массиве, программа должна вывести слово "Yes" и
        // вывести индекс (расположение, адрес) данного числа. Иначе вывести слово "No".

//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//        int []mass= new int[n];
//
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = in.nextInt();
//        }
//        int m = in.nextInt();
//        boolean f = false;
//        for (int i = 0; i < mass.length; i++) {
//            if (m == mass[i]){
//                System.out.println("Yes" +  "index " + i);
//                f = true;
//                break;
//            }else if (m != mass[i]){
//                f = false;
//            }
//        }
//        if (f == false){
//            System.out.println("No");
//        }
        //Практическое задание №1
        //Задание №1Программа запрашивает число n.
        // Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
        // Выведите в конце только положительные элементы.

//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//        int[]mass = new int[n];
//
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = in.nextInt();
//        }
//
//        for (int i = 0; i < mass.length ; i++) {
//            if (0 < mass[i]){
//                System.out.println(mass[i]);
//            }
//        }
        //3 задание -Программа запрашивает число n.
        // Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
        // Программа должна вывести умножение всех элементов, не равных 0.

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[]mass = new int[n];
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = in.nextInt();
//        }
//        int umno = 1;
//        for (int i = 0; i < mass.length; i++) {
//            if (0 != mass[i]){
//                umno *= mass[i];
//            }
//        }
//        System.out.println(umno);

        //4 задание Программа запрашивает число n.
        // Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
        //Программа должна вывести с начала все положительные элементы, затем нули и затем только отрицательные элементы.
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[]mass = new int[n];
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = in.nextInt();
//        }
//        for (int i = 0; i < mass.length; i++) {
//            if (0 < mass[i]){
//                System.out.print(mass[i]);
//            }
//        }
//        System.out.println("\n");
//        for (int i = 0; i < mass.length ; i++) {
//            if (0 == mass[i]){
//                System.out.print(mass[i]);
//            }
//        }
//        System.out.println("\n");
//        for (int i = 0; i < mass.length; i++) {
//            if (0 > mass[i]){
//                System.out.print(mass[i]);
//            }
//        }

        //5 задание Программа запрашивает число n.
        // Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
        // Затем мы вводим число m. Программа должна вывести среднее значение всех элементов, которые больше m.

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[]mass = new int[n];
//
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = in.nextInt();
//        }
//        int sum = 0;
//        int m = in.nextInt();
//        int counter = 0;
//        for (int i = 0; i < mass.length; i++) {
//            if (m < mass[i] ){
//                sum += mass[i];
//                counter++;
//            }
//        }
//        int sred = sum / counter;
//        System.out.println(sred);

        // 6 задание Программа запрашивает число n.
        // Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
        // Программа должна вывести сумму всех чисел которые находятся между нулями.
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] mass = new int[n];
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = in.nextInt();
//        }
//        int sum = 0;
//        int pervii = -1;
//        int poslednii = -1;
//        boolean f = false;
//        boolean d = false;
//        for (int i = 0; i < mass.length; i++) {
//            if (0 == mass[i]){
//                pervii = i;
//                f = true;
//                break;
//            }
//        }
//        for (int i = mass.length - 1; i >=0 ; i--) {
//            if (0 == mass[i]){
//                poslednii = i;
//                d = true;
//                break;
//            }
//        }
//        if (f == true && d == true){
//            for (int i = pervii; i < poslednii ; i++) {
//                sum += mass[i];
//            }
//        }
//        System.out.println(sum);

    }
}
