package methodsLoadingOverridding;

public class OVerloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The area of square is"+area(10.0f));
		System.out.println("The area of rectangle is:"+area(10,20));
		System.out.println("The area of int rectangle is:"+area(12L));
		
		

	}
	public static double area(double len, double wid) {
		return len*wid;
	}
//	public static double area(double side) {
//		return side*side;
//	}
	public static float area(float side) {
		return side*side;
	}

}
