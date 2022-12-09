package basics;

/* For palindrome checking, one approach is to reverse the string and compare it with the
 *  original string, if both the strings are equal, then we can say that the string is a 
 *  palindrome. Here, we have used BufferString Class to use the inbuilt reverse function as
 *   it is not available with string data type.
 */

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "kayak", s2 = "kappa";
		palindorme(s1);
		palindorme(s2);
		
	}
	
	public static void palindorme(String s) {
		StringBuffer s1= new StringBuffer();
		StringBuffer s2=new StringBuffer();
		s1=s1.reverse();
		if(s1.toString().equals(s2.toString())) {
			System.out.println("String "+s+" is palindrome");
		}
		else {
			System.out.println("not");
		}

	}

}
