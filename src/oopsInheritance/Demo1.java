package oopsInheritance;

class Vehicle1{
	private String engine;
	private int wheels;
	private int seats;
	private int fueltank;
	private String lights;
	public Vehicle1() {
		//super();
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fueltank = 35;
		this.lights = "LED";
		
	}
	public Vehicle1(String engine, int wheels, int seats, int fueltank, String lights) {
		//super();
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fueltank = fueltank;
		this.lights = lights;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getFueltank() {
		return fueltank;
	}
	public void setFueltank(int fueltank) {
		this.fueltank = fueltank;
	}
	public String getLights() {
		return lights;
	}
	public void setLights(String lights) {
		this.lights = lights;
	}
		
}

class Bike1 extends Vehicle1{
	private String handle;

	public Bike1() {
		super();
		this.handle="short";
	}

	
	public Bike1(String handle,String engine, int wheels, int seats, int fueltank, String lights) {
		super(engine, wheels, seats, fueltank, lights);
		// TODO Auto-generated constructor stub
		this.handle=handle;
	}


	public String getHandle() {
		return handle;
	}


	@Override
	public String toString() {
		return "Bike1 [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFueltank()=" + getFueltank() + ", getLights()=" + getLights()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}

class Car1 extends Vehicle1{
	public String steering;
	public String musicSystem;
	public String airconditioner;
	public String fridge;
	public String entertainmentSyetem;
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bike1 bike=new Bike1();
//		System.out.println(bike.getHandle());
//		System.out.println(bike.getEngine());
		Bike1 bike1=new Bike1("long","Diesel",4,4,40,"LED");
		System.out.println(bike1);

	}

}
