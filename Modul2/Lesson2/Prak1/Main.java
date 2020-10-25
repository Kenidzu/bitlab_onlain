package Lesson2.Prak1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User[] mass = new User[5];
        int age;
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Введите имя ");
            String name = in.next();
            System.out.println("Введите фамилию ");
            String surname = in.next();
            System.out.println("Введите возраст ");
            try {
                age = in.nextInt();

            }catch (Exception e){
                age = 0;
                String s = in.next();
            }
            mass[i] = new User(name,surname,age);
        }
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i].getAge();
            if (mass[i].getAge()==0){
                System.out.println(mass[i].toString());
            }
        }
        System.out.println(sum);
    }
}
