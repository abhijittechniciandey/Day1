package oopsInheritance;

class Bicycle{
	public int gear;
	public int speed;
	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}
	public void applyBrake(int decrement) {
		speed -=decrement;
	}
	public void speedUp(int increment) {
		speed +=increment;
	}
	
	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	
}

class MountainBike extends Bicycle{
	public int seatHeight;

	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	@Override
	public String toString() {
		return (super.toString()+"\n seat height is "+seatHeight);
	}
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(3, 100, 25);
		System.out.println(mb.toString());

	}

}
