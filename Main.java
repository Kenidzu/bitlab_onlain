import java.util.*;

public class Main{
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.model = "520";
		c1.color = "black";
		c1.engineVolume = 2.4;
		c1.speed = 120;

		Car c2 = new Car();
		c2.name = "Mercedes";
		c2.model = "AMG";
		c2.color = "silver";
		c2.engineVolume = 2.8;
		c2.speed = 240;

		c1.printCarData();
		c1.switchOn();
		c1.ride();
		c1.accelerate();
		c1.deaccelerate();
		c1.stop();
		c1.switchOff();

		c2.printCarData();
		c2.accelerate();
		c2.deaccelerate();
		c2.switchOn();
		c2.switchOff();

		System.out.println("I am writing a large amount of code");

		System.out.println(c1.name);
		System.out.println(c2.color);

		Car c3 = new Car("Toyota", "Camry", 210, 2.0, "Red");
		c3.accelerate();
		c3.printCarData();

		Car c4 = new Car();
		c4.printCarData();

		Car c5 = new Car("Lamborgini");
		c5.printCarData();

		Car cars [] = {c1, c2, c3, c4, c5};
		for(int i=0;i<cars.length;i++){
			System.out.println(cars[i].name + " "+ cars[i].model + " " + cars[i].color);
		}

		System.out.println("2 Years later...");

		c1.color = "Green";

		for(int i=0;i<cars.length;i++){
			System.out.println(cars[i].name + " "+ cars[i].model + " " + cars[i].color);
		}

		for(int i=0;i<cars.length;i++){
			System.out.println("###########");
			System.out.println("Car " + cars[i].name + " " + cars[i].model + " is starting ");
			cars[i].accelerate();
			System.out.println("Car " + cars[i].name + " " + cars[i].model + " is finishing ");
			cars[i].deaccelerate();
		}

	}
}