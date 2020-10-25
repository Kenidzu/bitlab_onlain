public class Main {
    public static void main(String[] args) {
        Staff []staff1 = new Staff[]{
                new Staff(1,"Kuanysh","Zhumayev",350000),
                new Staff(2,"Rustam","Angel",250000),
                new Staff(3,"Sulo","Kuren",280000),
                new Staff(4,"Luks","Later",210000),
                new Staff(5,"Jonh","Diavol",330000),
        };
        HRManagers[] managers6 = new HRManagers[]{
                new HRManagers(1,"Aigerim",120000),
                new HRManagers(2,"Aidar",180000),
                new HRManagers(3,"Kaisar",160000),
                new HRManagers(4,"Dozhan",210000),
                new HRManagers(5,"Gukhar",290000)
        };
        Programmers [] it6 = new Programmers[]{
                new Programmers(1,"Kenidzu",330000,150000,1.8),
                new Programmers(2,"Ken",380000,90000,2.3),
                new Programmers(3,"Blank",365000,120000,2.1),
                new Programmers(4,"Loter",180000,135000,2.0),
                new Programmers(5,"Venom",210000,165000,1.8)

        };
        int maxstaff = 0;
        int counter = 0;
        for (int i = 0; i < staff1.length; i++) {
            if (maxstaff < staff1[i].getSalary()){
                maxstaff = staff1[i].getSalary();
                counter = i;
            }
        }
        System.out.println(staff1[counter].toString());
        int maxmanager = 0;
        counter = 0;
        for (int i = 0; i < managers6.length; i++) {
            if (maxmanager < managers6[i].getSalary()){
                maxmanager = managers6[i].getSalary();
                counter = i;
            }
        }
        System.out.println(managers6[counter].toString());
        int maxit = 0;
        counter = 0;
        for (int i = 0; i < it6.length; i++) {
            if (maxit < it6[i].getSalary()){
                maxit = it6[i].getSalary();
                counter = i;
            }
        }
        System.out.println(it6[counter].toString());
        Staff st2 = new Staff();
        for (int i = 0; i < staff1.length; i++) {
            for (int j = i + 1; j < staff1.length; j++) {
                if (staff1[i].getSalary() > staff1[j].getSalary()){
                    st2 = staff1[i];
                    staff1[i] = staff1[j];
                    staff1[j] = st2;
                }
            }
        }
        for (int i = 0; i < staff1.length; i++) {
            System.out.println(staff1[i].toString());
        }
        HRManagers managers7 = new HRManagers();
        for (int i = 0; i < managers6.length; i++) {
            for (int j = i + 1; j < managers6.length; j++) {
                if (managers6[i].getSalary() > managers6[j].getSalary()){
                    managers7 = managers6[i];
                    managers6[i] = managers6[j];
                    managers6[j] = managers7;
                }
            }
        }
        for (int i = 0; i < managers6.length; i++) {
            System.out.println(managers6[i].toString());
        }
        Programmers it8 = new Programmers();
        for (int i = 0; i < it6.length; i++) {
            for (int j = i + 1; j < it6.length; j++) {
                if (it6[i].getSalary() > it6[j].getSalary()){
                    it8 = it6[i];
                    it6[i] = it6[j];
                    it6[j] = it8;
                }
            }
        }
        for (int i = 0; i < it6.length; i++) {
            System.out.println(it6[i].toString());
        }
    }
}
