package introductionToJava;

import java.math.BigDecimal;

public class FloatError {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		double a=0.03;
//		double b=0.04;
//		double c=a-b;
//		System.out.println(c);
//		// floating error for floating point number solution : Big decimal number
//
//	}
	public static void main(String[] args) {
		BigDecimal a= new BigDecimal("0.03");
		BigDecimal b= new BigDecimal("0.04");
		BigDecimal c =b.subtract(a);
		System.out.println(c);
	}

}
