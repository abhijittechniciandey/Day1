package exception;

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException.check(14);
		

	}
	
	public static void check(int age) {
		
		if(age>=18) {
			System.out.println("Eligible for vote");
		}
		else {
			throw new IllegalArgumentException("Not Eligible");
		}
	}

}
