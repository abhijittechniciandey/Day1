package introductionToJava;

public class DynamicInputMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loops(5,1);
		System.out.println("****");
		loops(4,1);

	}
	
	public static void loops(int fin, int step) {
		while(step<=fin) {
			System.out.print(step);
			step++;
		}
		System.out.println("\n");
	}

}
