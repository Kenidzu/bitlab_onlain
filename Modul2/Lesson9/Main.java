package Lesson9;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DBManager dbmanager = new DBManager();
        dbmanager.connect();


        dbmanager.addCar(new Car("Hyuindai",15000,20000));
        ArrayList<Car> cars = dbmanager.getAllCars();

        for (Car c: cars){
            System.out.println(c);
        }
    }
}
