package oopscustom;

import oopscustom.Person;

class Person{
	private String name;
	private int age;
	private String gender;
	
	public Person() {
		this.name="john";
		this.age=29;
		this.gender="Male";
	}
	
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public boolean setAge(int age) {
		if(age>=0 && age<=100) {
			this.age = age;
			return true;
		}
		return false;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
}


public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		System.out.println(p);
		
		Person P1=new Person("Aarti", 24, "Female");
		System.out.println(P1);
		P1.setAge(23);
		System.out.println(P1);

	}

}
