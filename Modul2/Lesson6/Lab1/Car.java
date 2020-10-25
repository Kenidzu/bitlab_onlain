package Lesson6.Lab1;

public class Car extends Thread{
    private int speed;
    private double distance;

    public Car() {
    }



    public Car(ThreadGroup group, String name, int speed, double distance) {
        super(group, name);
        this.speed = speed;
        this.distance = distance;
    }

    @Override
    public void run() {
        try {
            int drivenDistance = 0;
            for (int i = 0; i < distance / speed; i++) {
                drivenDistance += speed;
                System.out.println(getName() + " is in: " + drivenDistance);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
