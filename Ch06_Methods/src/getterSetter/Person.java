package getterSetter;

public class Person {
	// private는 같은 클래스에서만 접근 가능(보안을 위해서)
	private String name;
	private int age;
	// private는 다른 클래스에서 쓸 수 없음
	// public은 다른 클래스에서 쓸 수 있음
	// set은 값을 입력하는 메소드
	public void setName(String name) {
		System.out.println(this); //new Person 객체의 주소
		// this=p1, p2
		this.name = name;//이때 this는 인스턴스를 의미
		// p1.name, p2.name = 입력된 네임
	}
	public void setAge(int age) {
		System.out.println(this);
		this.age = age;//이때 this는 인스턴스를 의미
	}
	
	// get메소드는 값을 리턴하는 메소드
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
