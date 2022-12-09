package exception;

class MyException extends Exception{
	
	public MyException(String s) {
		
		super(s);
		
		
	}
	
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException("GFG");
		}
		catch(MyException ex) {
			System.out.println("caught");
			System.out.println(ex.getMessage());
		}
		

	}

}
