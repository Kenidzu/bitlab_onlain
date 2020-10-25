package Lesson5.Prak1;

import java.io.Serializable;

public class Subject implements Serializable{
    private String name;
    private int credits;

    public Subject() {
    }

    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", credits=" + credits +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
