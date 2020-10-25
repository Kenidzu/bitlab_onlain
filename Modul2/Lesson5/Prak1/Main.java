package Lesson5.Prak1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("PRESS [1] TO ADD STUDENT\nPRESS [2] TO LIST STUDENTS\nPRESS [0] TO EXIT");
            int num = in.nextInt();
            if (num == 1){
                System.out.println("Name");
                String name = in.next();
                System.out.println("Surname");
                String surname = in.next();

                System.out.println("PRESS [1] TO ADD SUBJECT\nPRESS [0] TO GO TO MAIN MENU");
                int number = in.nextInt();
                if (number == 1){
                    System.out.println("Name:");
                    String subjectname = in.next();
                    System.out.println("Credits ");
                    int subjectscredits = in.nextInt();
                    File file = new File("students.txt");
                    ArrayList<Student>students = new ArrayList<>();
                    if (file.length() != 0){
                         students = readstudents();
                    }
                    ArrayList<Subject>subjects = new ArrayList<>();
                    Subject sub = new Subject(subjectname,subjectscredits);
                    subjects.add(sub);
                    Student stud = new Student(name,surname,subjects);
                    students.add(stud);
                    savestudent(students);
                }
                else if (number == 0){
                    ArrayList<Student> students = readstudents();
                    ArrayList<Subject> subjects = new ArrayList<>();
                    Student student = new Student(name,surname,subjects);
                    students.add(student);
                    savestudent(students);
                    continue;
                }
            } else if (num == 2) {
                ArrayList<Student>students = readstudents();
                for (int i = 0; i < students.size(); i++) {
                    System.out.println((i + 1) + students.get(i).toString());
                }
            }
            else if (num == 0){
                System.exit(0);
            }
            else {
                System.out.println("Wrong Command!");
            }
        }
    }


    public static void savestudent(ArrayList<Student>students){
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("students.txt"));
            outputStream.writeObject(students);
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Student> readstudents() {
        ArrayList<Student>students = new ArrayList<>();
        try {

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("students.txt"));
            students = (ArrayList<Student>)inputStream.readObject();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }
}
