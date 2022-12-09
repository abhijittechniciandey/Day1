package basics;
/*The above program is a bit complicated, hence needs explanation. Since the Binary
 *  form of a number is represented by 0s and 1s, hence for a large decimal number 
 *  (having 10-15 digits), it might not be even accommodable by unsigned long long int.
 *   Hence, we use string to store the answer. The expression (x & 1) finds out whether 
 *   the remainder is divisible by 2. If yes, the remainder is 0, otherwise 1. We append this
 *    value after adding ASCII '0' to the binary string and type casting to char. At each step,
 *     we further divide x by 2 by right-shift-1. Finally, we reverse the binary string to get 
 *     the desired result.
 */

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x=32;
		String bin="";
		while(x!=0) {
			bin += (char)((x&1)+'0');
			x>>=1;
		}
		StringBuffer st= new StringBuffer(bin);
		st=st.reverse();
		System.out.println(st);
	

	}

}
