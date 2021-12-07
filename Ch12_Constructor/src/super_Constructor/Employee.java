package super_Constructor;

public class Employee extends Person {
	public Employee() {
		//상속을 받았을 경우 super();이 생략되어있다
		// super(); // 부모클래스의 생성자
		//person에 매개변수 입력하면 에러나기때문에 익명 입력
		super("익명"); // 부모클래스의 생성자		
		System.out.println("Employee 생성자");
	}
	public Employee(String name) {
		super(name);
		System.out.println("Employee 생성자");
	}
}
