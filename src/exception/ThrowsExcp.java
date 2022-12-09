package exception;

public class ThrowsExcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			fun();
		}
		catch(IllegalAccessException e) {
			System.out.println("caught in main");
		}

	}
	static void fun() throws IllegalAccessException{
		System.out.println("inside fun()");
		throw new IllegalAccessException("deom");
	}

}
