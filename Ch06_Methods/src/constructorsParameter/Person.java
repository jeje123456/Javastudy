package constructorsParameter;

public class Person {
	private String name;
	private double height;
	
	// public Person() { }//기본생성자로 생략되어있음
	// 생성자 메소드 : public + 클래스명(), 리턴타입 없음
	// 아래 2개의 생성자는 각각의 생성자로 여러개여도 작동함.
	public Person() {
		name = "익명";
		height = 163;
		System.out.println("한 사람을 생성!");
	}
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
		System.out.println("한 사람을 생성!");
	}
	
	// toString 메소드
	public String toString() {
		return "이름 : " + name + ", "+ "키 :" + height;
	}

	// get set 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

}
