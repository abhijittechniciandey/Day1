package polymorphism;

public class Phone {
	
	private String Model; // one members
	

	public String getModel() {
		return Model;
	}
	public Phone(String model) {
		
		Model=model;
	}
	public void features() {
		System.out.println("featured phone");
	}

}
