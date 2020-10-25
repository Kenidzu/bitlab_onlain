import Prak.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    //Практика 1 .Задание 2
//    public static void topStudent(Student a[]) {
//        int max = 0;
//        int counter = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (max < a[i].gpa) {
//                max = (int) a[i].gpa;
//                counter = i;
//            }
//        }
//        System.out.println("Name " + a[counter].name + "\t" + "id " + a[counter].id + "\t" + "Surname " + a[counter].surname + "\t" + "Gpa" + a[counter].gpa);
//    }
    public static void main(String[] args) {
        //Практическое задание №1.Задание 1
        //Создайте класс Student с параметрами:

//        Student s1 = new Student(240,"Kuanysh","zhumayev",3.14);
//
//        Student s2 = new Student(120,"Maksat","Kurenkeyeev",3.47);
//
//        Student s3 = new Student(330,"Doszhan","Mambetalin",4.40);
//
//        Student s4 = new Student(500,"Diana","Sekal",4.25);
//
//        Student s5 = new Student(50,"Alua","Nokia",4.52);
//
//        Student s6 [] = new Student[]{s1,s2,s3,s4,s5};
//
//        for (int s7 = 0; s7 < s6.length; s7++) {
//            System.out.println(s6[s7].getStudentData());
//        }
//        //Задание 2
//        //Используйте предыдущий класс Student.
//        //Создайте в классе Main специальный метод topStudent(Student students[]),
//        // который в аргументы принимает массив из студентов. Метод должен вывести из списка данные самого лучшего студента,
//        // у которого высокий gpa. Создайте 10 объектов разных студентов с разными параметрами. Примените этот метод.
//        Student a1 = new Student(1,"Rustam","Faizulin",3.52);
//        Student a2 = new Student(2,"Kuanysh","Zhumayev",3.85);
//        Student a3 = new Student(3,"Vitalii","Krasilnikov",4.24);
//        Student a4 = new Student(4,"Maksat","Kurenkeyeev",3.47);
//        Student a5 = new Student(5,"Doszhan","Mambetalin",4.40);
//        Student a6 = new Student(6,"Diana","Sekal",4.25);
//        Student a7 = new Student(7,"Alua","Nokia",4.52);
//        Student a8 = new Student(8,"Lenin","Ilya",4.67);
//        Student a9 = new Student(9,"Timur","Tekeli",3.15);
//        Student a10 = new Student(10,"Aigerim","Ibrayeva",2.65);
//        Student a11 [] = new Student[]{a1,a2,a3,a4,a5,a6,a7,a8,a9,a10};
//        topStudent(a11);

        //Задание №3
//        Scanner in = new Scanner(System.in);
//
//
//        int counter = 0;
//        Student all[] = new Student[100];
//        while(true) {
//            System.out.println("Press [1] TO ADD Student");
//            System.out.println("Press [2] TO LIST Student");
//            System.out.println("Press [0] TO EXIT");
//            int a = in.nextInt();
//
//
//            if (a == 1) {
//                System.out.println("Insert name");
//                String name = in.next();
//                System.out.println("Insert surname");
//                String surname = in.next();
//                System.out.println("Insert GPA");
//                double gpa = in.nextDouble();
//                Student s1 = new Student(counter, name, surname, gpa);
//                all[counter] = s1;
//                counter++;
//
//            }
//            else if (a == 2){
//                for (int i = 0; i < counter; i++) {
//                    System.out.println(all[i].getStudentData());
//                }
//            }
//            else if (a == 0){
//                System.out.println("Программа завершена");
//                break;
//            }
//        }

        //6 Задание

        BankApplications worker = new BankApplications();
        System.out.println("Welcome Bitlab - Almaty");
        Scanner in = new Scanner(System.in);
        int counter = 0;
        while (true){
            System.out.println("PRESS [1] TO ADD WORKER\nPRESS [2] TO LIST WORKERS\nPRESS [0] TO EXIT");
            int a = in.nextInt();
            if (a == 1){
                System.out.println("ID");
                int id = in.nextInt();
                System.out.println("Name");
                String name = in.next();
                System.out.println("Surname");
                String surname = in.next();
                System.out.println("Department");
                String department = in.next();
                System.out.println("Salary");
                int salary = in.nextInt();
                System.out.println("Country");
                String country = in.next();
                Worker people = new Worker(id,name,surname,department,salary);
                worker.addWorker(people);
            }
            else if (a == 2){
                worker.listWorkers();
            }
            else if (a == 0){
                System.out.println("The end");
                break;
            }
            else {
                System.out.println("Nepravilno vvedenaya sifra");
            }
        }
    }
}
