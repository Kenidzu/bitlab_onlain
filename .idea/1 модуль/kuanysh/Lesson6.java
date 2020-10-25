import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        //Практическое задание 1
        //Задание 1 Программа запрашивает число N, затем вы создаете двумерный массив с размером 2xN, заполняете их.
        // Программа должна вывести "Yes", если числа в первом массиве совпадают со вторыми. Иначе "No".
//        Scanner in= new Scanner(System.in);
//        int n = in.nextInt();
//        int mass[][] = new int[2][n];
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < n; j++) {
//                mass [i][j] = in.nextInt();
//            }
//        }
//        boolean f =  true;
//        for (int i = 0; i < n ; i++) {
//            if (mass[0][i] != mass[1][i]){
//                f = false;
//                break;
//            }
//        }
//        if (f){
//            System.out.println("YES");
//        }
//        else {
//            System.out.println("NO");
//        }

        //2 задание Программа запрашивает два числа N и M, затем мы создаем двумерный массив и заполняем их числами.
        // Программа в конце должна посчитать количество отрицательных чисел, и при выводе их заменить символом "х".
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int mass[][] = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                mass[i][j] = in.nextInt();
//            }
//        }
//        int counter  = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (mass[i][j] < 0){
//                    System.out.print("x ");
//                    counter++;
//                }
//                else {
//                    System.out.print(mass[i][j] + " ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println(counter);

        //3 задание Программа запрашивает два числа N и M, затем мы создаем двумерный массив и заполняем их числами.
        // Программа должна вывести количество отрицательных чисел в каждой строке.
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int mass[][] = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                mass[i][j] = in.nextInt();
//            }
//        }
//        for (int i = 0; i < n ; i++) {
//            int counter = 0;
//            for (int j = 0; j < m; j++) {
//                if (mass[i][j] < 0){
//                    counter++;
//                }
//            }
//            if (counter > 0){
//                System.out.println("В данной строке отрицательных чисел " + counter);
//            }
//            else{
//                System.out.println("В данной строке нет отрицательных чисел");
//            }
//        }

        // 4 задание Программа запрашивает число N, затем мы создаем двумерный массив N x N и заполняем их числами.
        // Программа должна вывести массив таким образом, как в нижних примерах.
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = n;
//        int mass[][] = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                mass[i][j] = in.nextInt();
//            }
//        }
//        int c = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (i == c && j == c ){
//                    System.out.print("x ");
//                }
//                else {
//                    System.out.print(mass[i][j] + " ");
//                }
//            }
//            System.out.println();
//            c++;
//        }

        // 5 задание Программа запрашивает число N, затем мы создаем двумерный массив N x N и заполняем их числами.
        // Программа должна вывести "Yes", если диагонали элементов симметричны, иначе "No".
        //*** Для понятия диагонали, они в примере выделены жирным шрифтом.
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int mass [][] = new int[n][n];
//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j < n; j++) {
//                mass[i][j] = in.nextInt();
//            }
//        }
//        boolean f = false;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i !=j){
//                  if (mass[i][j] == mass [j][i]){
//                      f = true;
//                  }
//                  else {
//                      f = false;
//                  }
//                }
//            }
//        }
//        if (f){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("NO");
//        }
        //Лабораторная работа №1
        // задание 1 Напишите программу в котором я ввожу два числа N и M.
        // Затем создаю двумерный массив NxM. Далее мы заполняем этот массив числами.
        // Программа должна вывести максимальный элемент в каждой строке.

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int mass[][] = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                mass[i][j] = in.nextInt();
//            }
//        }
//        for (int i = 0; i < n ; i++) {
//            int max = 0;
//            for (int j = 0; j < m; j++) {
//                if (max < mass[i][j]){
//                    max = mass[i][j];
//                }
//            }
//            System.out.println(max);
//        }

        // 2 задание Программа запрашивает число N, затем мы создаем двумерный массив N x N и заполняем их числами.
        // Программа должна вывести массив таким образом, как в нижних примерах.

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int mass[][]=new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                mass[i][j] = in.nextInt();
//            }
//        }
//        System.out.println();
//
//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == j || j ==(n - 1 - i)){
//                    System.out.print(" x ");
//                }
//                else {
//                    System.out.print(mass[i][j] + " ");
//                }
//            }
//            System.out.println();
//        }


        //3 задание Программа запрашивает число N, затем мы создаем двумерный массив N x N и заполняем их числами.
        // Программа должна заменить первую горизонтальную половину на вторую горизонтальную половину.
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int mass[][] = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                mass[i][j] = in.nextInt();
//            }
//        }
//        int g = n/2;
//        for (int i = 0; i < n/2; i++) {
//            int k = 0;
//            g++;
//            for (int j = 0; j < n; j++) {
//                int temp = mass[i][j];
//                mass[i][j] = mass[g][k];
//                mass[g][k] = temp;
//                k++;
//            }
//
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(mass[i][j]);
//            }
//            System.out.println();
//        }

        //4 задание Напишите программу в котором я ввожу два числа N и M.
        // Затем создаю двумерный массив NxM. Далее мы заполняем этот массив числами.
        // Программа должна заменить максимальный элемент на минимальный элемент по колонке.
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int mass[][] = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                mass[i][j] = in.nextInt();
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            int min = mass[0][i];
//            int max = mass[0][i];
//            for (int j = 0; j < n; j++) {
//                if (max < mass[j][i]){
//                    max = mass[j][i];
//                }
//                else if (min > mass[j][i]){
//                    min = mass[j][i];
//                }
//            }
//            for (int g = 0; g < n; g++) {
//                if (mass [g][i] == max){
//                    mass [g][i] = min;
//                }
//                else if (mass[g][i] == min){
//                    mass[g][i] = max;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(mass[i][j]);
//            }
//            System.out.println();
//        }

        //5 задание Напишите программу, в которой я ввожу два числа N и M.
        // Затем создаю двумерный массив NxM. Далее мы заполняем этот массив числами.
        // Затем, мы вводим число k. Программа должна вывести первые k отрицательных элементов в каждой колонке,
        // как показано в примере.
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int mass[][] = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                mass[i][j] = in.nextInt();
//            }
//        }
//        int k = in.nextInt();
//
//        for (int i = 0; i < m; i++) {
//            int counter = 0;
//            boolean f = false;
//            for (int j = 0; j < n; j++) {
//                if (mass[j][i] < 0){
//                    System.out.print(mass[j][i]);
//                    counter++;
//                    f = true;
//                }
//                if (counter == k){
//                    break;
//                }
//            }
//            if (f == false){
//                System.out.print(" x ");
//            }
//        }
    }
}
