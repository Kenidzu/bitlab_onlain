//package НаследованиеPrak2;
//
//public class Staff extends User {
//    private double salary;
//    private String subjects [] = new String[100];
//    private int indexOfSubject = 0;
//
//    public Staff(){
//
//    }
//
//    public Staff(int id, String login, String password, String name, String surname, double salary) {
//        super(id, login, password, name, surname);
//        this.salary = salary;
//
//    }
//
//    @Override
//    public String getData() {
//        return super.getData() + getSalary();
//    }
//
//    public void addsubjects(String subject){
//        subjects[indexOfSubject] = subject;
//        indexOfSubject++;
//    }
//    public String addSubjects(int a){
//        return subjects[a];
//    }
//    public void vivod(){
//        for (int i = 0; i < indexOfSubject; i++) {
//            System.out.println(subjects[i]);
//        }
//
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public int getIndexOfSubject() {
//        return indexOfSubject;
//    }
//
//    public void setIndexOfSubject(int indexOfSubject) {
//        this.indexOfSubject = indexOfSubject;
//    }
//}
