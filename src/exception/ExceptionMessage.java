package exception;

public class ExceptionMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=0;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("hello");
		}

	}
}
