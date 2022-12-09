package exception;

public class GFG {
	
	static int divideByzro(int a, int b) {
		int i=a/b;
		return i;
	}
	static int computeDivision(int a, int b) {
		int res=0;
		try {
			res=divideByzro(a, b);
		}
		catch(NumberFormatException ex) {
			System.out.println("Number Format Exception");
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=0;
		try {
			int i= computeDivision(a, b);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}

	}

}
