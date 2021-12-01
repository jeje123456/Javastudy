package super_Constructor;

public class App {

	public static void main(String[] args) {
		// super() 생성자
		// 부모클래스의 생성자가 먼저 실행되고 자식클래스의 생성자가 실행된다.
		Employee e1 = new Employee();		
		System.out.println(e1);
		
		Employee e2 = new Employee("펭수");		
		System.out.println(e2);
	}

}
