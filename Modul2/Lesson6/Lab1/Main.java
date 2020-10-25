package Lesson6.Lab1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        ThreadGroup threadGroup = new ThreadGroup("Group");
        Car car1 = new Car(threadGroup,"Ferrari",120,1000);
        Car car2 = new Car(threadGroup,"Renault",110,1000);
        Car car3 = new Car(threadGroup,"Porshe",140,1000);
        Car car4 = new Car(threadGroup,"Zhiguli",60,1000);
        Car car5 = new Car(threadGroup,"Lada",80,1000);
        Car car6 = new Car(threadGroup,"Toyota",85,1000);
        Car car7 = new Car(threadGroup,"BMW",110,1000);
        Car car8 = new Car(threadGroup,"Mersedes",110,1000);
        Car car9 = new Car(threadGroup,"Tesla",105,1000);
        Car car10 = new Car(threadGroup,"Gelen",90,1000);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);
        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();
        car6.start();
        car7.start();
        car8.start();
        car9.start();
        car10.start();

        ArrayList<Car> rezult = new ArrayList<>();
        int activeCount = threadGroup.activeCount();
        while (threadGroup.activeCount()>0){
            if (activeCount > threadGroup.activeCount()){
                activeCount--;
                for (Car c :cars){
                    if (!c.isAlive()){
                        rezult.add(c);
                        cars.remove(c);
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < rezult.size(); i++) {
            System.out.println(i + 1 + " " + rezult.get(i).getName());
        }
    }
}
