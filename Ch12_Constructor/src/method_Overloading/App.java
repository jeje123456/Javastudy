package method_Overloading;

public class App {

	public static void main(String[] args) {
		// 메소드 오버로딩
		// 메소드는 이름과 매개변수가 전부 같아야 같은 메소드로 인식한다
		Person p = new Person();
		
		p.greet();
		p.greet("펭수");
		p.greet(190);
		p.greet("라이언", 190);
		
		System.out.println("123");
		System.out.println(123);
		System.out.println(1.23);
	}

}
