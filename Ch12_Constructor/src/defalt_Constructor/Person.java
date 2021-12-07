package defalt_Constructor;

public class Person {

/*	public Person() {
		// 생성자는 클래스 이름과 같고 리턴 타입이 없음
		System.out.println("새 person이 생성됨");
	}
	
	@Override
	public String toString() {
		return "헬로우";
	}
*/	
/*	private String name;
	
	public Person(String name) {
		// 생성자는 클래스 이름과 같고 리턴 타입이 없음
		System.out.println("새 person이 생성됨");
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
*/
	private String name;
	private int age;	
	
	public Person(String name) {
		// 생성자는 클래스 이름과 같고 리턴 타입이 없음
		System.out.println("새 person이 생성됨");
		this.name = name;
		age = 0;
	}
	
	public Person() {
		System.out.println("디폴트 생성자로 생성됨");
		name = "모름";
		age = 0;
	}
	
	public Person(String name, int age) {
		System.out.println("디폴트 생성자로 생성됨");
		this.name = name;
		this.age = age;
	}
	// fields : 우리가 생성한 변수
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}