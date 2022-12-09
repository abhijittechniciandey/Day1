package methodsLoadingOverridding;

public class Overloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1,2));
		//sum(1,2.0); error for type mismatch
		System.out.println(sum(1,2.0f));

	}
	public static int sum(int x, int y) {
		//System.out.println("add of two int");
		return x+y;
	}
	public static float sum(int x, float y) {
		return x+y;
	}

}
