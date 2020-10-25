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

	}
}