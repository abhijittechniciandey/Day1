package polymorphism;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone =new Phone("Nokia 3310");
		System.out.println(phone.getModel()); //Nokia 3310
		phone.features(); //featured phone
		
		SumsungNote8 note8=new SumsungNote8("Note 8");
		System.out.println(note8.getModel()); // Note 8
		note8.features(); //Android flagship
		
		Phone Note8=new SumsungNote8("Note8 plus");
		System.out.println(Note8.getModel()); // Note8 plus
		Note8.features(); // Android flagship
		
		Phone nokia3310 =new Nokia3310("Nokia 3310");
		System.out.println(nokia3310.getModel());
		// Here there is no features methods but still we can able to fetch it beacause it is object to Phone
		nokia3310.features();
		
		Phone nokia331= new Hello().phone(1);	
		System.out.println(nokia331.getModel());
		nokia331.features();
		
	}
	public Phone phone(int dailyDriver) {
		switch(dailyDriver) {
		case 1: return new Nokia3310("3310");
		case 2: return new SumsungNote8("Note5");
		}
		return null;

}

}
