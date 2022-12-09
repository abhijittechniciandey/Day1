package exception;

public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String st=null;
			System.out.println(st.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("Nullpointer Exception");
		}
		finally {
			System.out.println("Hello World");
		}

	}

}
