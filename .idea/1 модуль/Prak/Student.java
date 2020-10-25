public class Student {
    //Практика №1
    public int id;
    public String name;
    public String surname;
    public double gpa;


    public Student(){

    }

    public Student(int id,String name,String surname,double gpa){

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    //Задание 1
    public String getStudentData(){
        return  id  + "\t"  + name   + surname   + gpa;
    }


}
