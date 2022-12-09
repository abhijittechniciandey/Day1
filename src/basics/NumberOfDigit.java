//Count the number of digits in a number
package basics;

public class NumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 23456;
		int num_digits=0;
		
		do {
			num_digits++;
			x/=10;
		}
		while(x!=0);
		System.out.println("Number of digits:"+num_digits);
		

	}

}
