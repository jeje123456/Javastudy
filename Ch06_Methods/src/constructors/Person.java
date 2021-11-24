package constructors;

public class Person {
	private String name;
	private double height;
	
	// public Person() { }//기본생성자로 생략되어있음
	// 생성자 메소드 : public + 클래스명(), 리턴타입 없음
	public Person() {
		name = "익명"; // 초기값 설정하면 값을 안줬을 때 출력됨
		height = 163;
		System.out.println("한 사람을 생성!");
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
