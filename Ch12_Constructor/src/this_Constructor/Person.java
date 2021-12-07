package this_Constructor;

public class Person {
	//ctrl 누른상태로 package창에 있는거 끌어서 옮기면 복사됨

	private String name;
	private int age;	
	
	//this하고 괄호는 생성자를 가르킨다.
	//this() = 이 클래스의 생성자
	public Person() {
		this("익명", 0);
	}
	
	public Person(String name) {
		// 생성자는 클래스 이름과 같고 리턴 타입이 없음
		this(name, 0);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// fields : 우리가 생성한 변수
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
