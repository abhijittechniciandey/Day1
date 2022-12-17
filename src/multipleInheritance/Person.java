package multipleInheritance;

public  class Person implements IsAlive,LiveLife {

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("Lif is journey");
		
	}
	//public abstract void eat();
	
	public void speak() {
		System.out.println("share your thoughts");
	}
	

}
