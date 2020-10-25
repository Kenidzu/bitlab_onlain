public class Car{

	int speed;
	String name;
	String color;
	double engineVolume;
	String model;

	public Car(){
		this.name = "No Name";
		this.color = "Silver";
		this.model = "No Model";
		this.engineVolume = 1.0;
		this.speed = 10;
	}

	public Car(String name, String model, int speed, double engineVolume, String color){
		this.name = name;
		this.model = model;
		this.color = color;
		this.engineVolume = engineVolume;
		this.speed = speed;
	}

	public Car(String name){
		this.name = name;
	}

	public void ride(){
		System.out.println("Car " + name + " : " + model + " is riding");
	}

	public void stop(){
		System.out.println("Car " + name + " : " + model + " is stopping");	
	}

	public void switchOn(){
		System.out.println("Car " + name + " : " + model + " is switching on! Vvrrrrr!!!");
	}

	public void switchOff(){
		System.out.println("Car " + name + " : " + model + " is switching Off! Bffffff!!!");
	}

	public void printCarData(){
		System.out.println("Car Name : "+name);
		System.out.println("Car Model : "+model);
		System.out.println("Car Max Speed : "+speed);
		System.out.println("Car Color : "+color);
		System.out.println("Car Engine Volume : "+engineVolume + " liters");
	}

	public void accelerate(){
		for(int i=0;i<=speed;i=i+10){
			System.out.println("Current speed of "+ name + " is : " + i + " km/h");
		}
	}
	public void deaccelerate(){
		for(int i=speed;i>=0;i=i-10){
			System.out.println("Current speed of "+ name + " is : " + i + " km/h");
		}
	}

}