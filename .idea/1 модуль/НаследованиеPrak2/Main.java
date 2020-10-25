import НаселодованиеПрактика1.Staff;
import НаселодованиеПрактика1.Student;
import НаселодованиеПрактика1.User;

import javax.swing.plaf.IconUIResource;
import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student [] human9 = new Student[]{};
        Staff [] people8 = new Staff[]{};
       Scanner in = new Scanner(System.in);
       int index = 0;
        while(true){
            System.out.println("Press [1] ADD USER");
            System.out.println("Press [2] TO LIST USERS");
            System.out.println("Press [0] TO EXIT");
            int c = in.nextInt();
            if (c == 1){
                System.out.println("Press [1] TO ADD Student");
                System.out.println("Press [2] TO ADD Staff");
                int d = in.nextInt();
                if (d == 1){
                    System.out.println("Введите номер");
                    int id = in.nextInt();
                    System.out.println("Введите логин");
                    String login = in.next();
                    System.out.println("Введите пароль");
                    String password = in.next();
                    System.out.println("Введите имя");
                    String name = in.next();
                    System.out.println("Введите фамилию");
                    String surname = in.next();
                    System.out.println("Введите Gpa");
                    int gpa = in.nextInt();
                    Student human7 = new Student(id,login,password,name,surname,gpa);
                    human9[index] = human7;
                    index++;
                }
                else if (d == 2){
                    System.out.println("Введите номер");
                    int id = in.nextInt();
                    System.out.println("Введите логин");
                    String login = in.next();
                    System.out.println("Введите пароль");
                    String password = in.next();
                    System.out.println("Введите имя");
                    String name = in.next();
                    System.out.println("Введите фамилию");
                    String surname = in.next();
                    System.out.println("Введите Salary");
                    int salary = in.nextInt();
                    Staff man8 = new Staff(id,login,password,name,surname,salary);
                    people8[index] = man8;
                    index++;
                }
                else {
                    continue;
                }
            }
            else if (c == 2){
                System.out.println("Press [1] TO LIST Students");
                System.out.println("Press [2] TO LIST Staff");
                if (c == 1){
                    Student human10 = new Student();
                    for (int i = 0; i < human9.length; i++) {
                        if (human10 instanceof Student){
                            System.out.println(human9[i].getData());
                        }
                    }
                }
                else if (c == 2){
                    Staff people11 = new Staff();
                    for (int i = 0; i < people8.length ; i++) {
                        if (people11 instanceof Staff){
                            System.out.println(people8[i].getData());
                        }
                    }
                }
                else {
                    continue;
                }
            }
            else if (c == 0){
                System.out.println("The end");
                break;
            }
            else {
                continue;
            }
        }
    }
}
