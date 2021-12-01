package super_Constructor;

public class Person {
	private String name;
	
//	public Person() {
//		System.out.println("Person 생성자");
//	}
	//person에 매개변수 입력
	public Person(String name) {
		System.out.println("Person 생성자");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
