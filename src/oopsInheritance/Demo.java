package oopsInheritance;

class Vehicle{
	public String engine;
	public int wheels;
	public int seats;
	public int fueltank;
	public String lights;
}

class Bike extends Vehicle{
	public String handle;
}

class Car extends Vehicle{
	public String steering;
	public String musicSystem;
	public String airconditioner;
	public String fridge;
	public String entertainmentSyetem;
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=new Bike();
		bike.handle="short";
		bike.engine="petrol";
		System.out.println(bike.engine);
		System.out.println(bike.lights);

	}

}
