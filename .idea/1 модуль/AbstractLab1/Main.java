import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ERPSystem people = new ERPSystem();
        while (true){
            System.out.println( "PRESS [1] TO ADD USER\nPRESS [2] TO LIST USERS\nPRESS [0] TO EXIT");
            int a = in.nextInt();
            if (a == 1){
                System.out.println("PRESS [1] TO ADD STUDENT\nPRESS [2] TO ADD TEACHER");
                int b = in.nextInt();
                if (b == 1){
                    System.out.println("ID");
                    int id = in.nextInt();
                    System.out.println("Login");
                    String login = in.next();
                    System.out.println("Password");
                    String password = in.next();
                    System.out.println("Name");
                    String name = in.next();
                    System.out.println("Surname");
                    String surname = in.next();
                    System.out.println("Group");
                    String group = in.next();
                    System.out.println("Gpa");
                    double gpa = in.nextDouble();
                    Student stud = new Student(id,login,password,name,surname,group,gpa);
                    people.addUser(stud);
                }
                else if (b == 2){
                    System.out.println("Nick Name:");
                    String nickname = in.next();
                    System.out.println("Status");
                    String status = in.next();
                    Teacher man1 = new Teacher(nickname,status);
                    people.addUser(man1);
                    int counter = 0;
                    while (true) {
                        System.out.println("PRESS [1] TO ADD SUBJECT\nPRESS [0] TO FINISH ADDING SUBJECT");
                        int h = in.nextInt();

                        if (h == 1) {
                            System.out.println("Subject");
                            String subject = in.next();
                            man1.addsubjects(subject);
                            counter++;
                        }
                        else if (h == 0){
                            break;
                        }
                        else {
                            continue;
                        }

                        if (counter == 10){
                            break;
                        }
                    }
                }
            }
            else if (a == 2){
                System.out.println("PRESS [1] TO LIST STUDENTS\nPRESS [2] TO LIST TEACHERS");
                int l = in.nextInt();
                if (l == 1){
                    people.printAllUsers();
                }
                else if (l==2){
                    people.printAllUsers();
                }
            }
            else if (a == 0){
                break;
            }
        }
    }
}
