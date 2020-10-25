//package НаселодованиеПрактика1;
//
//import java.sql.SQLOutput;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        User people1 = new User(1,"Kenidzu","Apple","Kuanysh","Zhumayev");
//        User people2 = new User(2,"Venom","Venik","Maksat","Kurenkeyev");
//        User people3 = new User(3,"Tinder","Venik","Serik","Kanapyanov");
//        User poeple4 = new User(4,"Badoo","Telok","Alex","DElon");
//        User people5 = new User(5,"Dota2","Warcraft","Lenin","Sulok");
//        User people7 = new User();
//        Student human1 = new Student(6,"Ditya","Lesnik","Lena","Seksi",4.24);
//        Student human2 = new Student(7,"Demon","Lesnik","Lena","Seksi",4.24);
//        Student human3 = new Student(8,"Lesnik","Lesnik","Lena","Seksi",4.24);
//        Student human4 = new Student(9,"Angel","Lesnik","Lena","Seksi",4.24);
//        Student human5 = new Student(10,"","Lesnik","Lena","Seksi",4.24);
//        Student human6 = new Student();
//        Staff man1 = new Staff(11,"Legion","Legion","Luka","Milana",3.54);
//        Staff man2 = new Staff(12,"Seka","Seka","Seka","Seka",5.66);
//        Staff man3 = new Staff(13,"Dimon","Dimon","Dimon","Dimon",4.33);
//        Staff man4 = new Staff(14,"Debil","DEbil","Debil","Debil",6.55);
//        Staff man5 = new Staff(15,"Askar","ASkar","Askar","ASkar",6.55);
//        Staff man6 = new Staff();
//        User[] people6 = new User[]{people1,people2,people5,people7,poeple4,human1,human2,human3,human4,human5,man1,man2,man3,man4,man5};
//        Scanner in = new Scanner(System.in);
//        while(true){
//            System.out.println("Добавьте курсы ученикам");
//            String courses = in.next();
//            if (courses.equals("exit")){
//                break;
//            }
//            else{
//                human6.addCourse(courses);
//            }
//        }
//        human6.vivod();
//        while(true){
//            System.out.println("Добавьте курсы рабочим.При окончании нажмите exit");
//            String subject = in.next();
//            if (subject.equals("exit")){
//                break;
//            }
//            else {
//                man6.addsubjects(subject);
//            }
//        }
//        man6.vivod();
//
//
//        for (int i = 0; i < people6.length; i++) {
//            System.out.println("Выберите курсы");
//            int b = in.nextInt();
//            System.out.println("Выберите subject");
//            int c = in.nextInt();
//            System.out.println(people6[i].getData() + " "+human6.addCourse(b) + " " +  man6.addSubjects(b));
//        }
//    }
//}
