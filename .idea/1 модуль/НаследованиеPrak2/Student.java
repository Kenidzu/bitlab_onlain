public class Student extends User {
    private double gpa;
    private String courses [] = new String[100];
    private int indexOfCourses = 0;

    public Student() {

    }

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    @Override
    public String getData() {
        return super.getData() + getGpa();
    }

    public void addCourse(String course){
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }
    public String addCourse(int a){
        return courses[a];
    }
    public void vivod(){
        for (int i = 0; i < indexOfCourses; i++) {
            System.out.println(courses[i]);
        }
    }



    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfCourses = indexOfCourses;
    }
}
