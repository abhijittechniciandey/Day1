package introductionToJava;

public class AreaCalc {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.print("The area of rectangle is:");
//		areaOfRect(10, 20);
//
//	}
//	
//	public static void areaOfRect(int len, int wid) {
//		System.out.println(len*wid);
//	}
	
	public static void main(String[] args) {
		System.out.println("The area of rectangle is:"+area(10, 20));
		
	}
	public static int area(int len, int wid) {
		return len*wid;
	}

}
