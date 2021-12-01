package multi_Inheritance;

// interface가 간단할때는 하나의 파일에 여러개 넣어도 된다.
interface Speaker{
	void speak(); // 추상메소드
}
interface Greeter{
	void greet(); // 추상메소드
}

public class App {

	public static void main(String[] args) {
		// 인터페이스는 다중 구현이 가능하다.
		
		Person p1 = new Person();
		p1.greet();
		p1.speak();
		
		//Person이 구현한 인터페이스 Speaker로 선언
		Speaker p2 = new Person();
		p2.speak();
//		p2.greet(); //Speaker 인터페이스의 추상메소드만 사용가능 
		
		Greeter p3 = new Person();
//		p3.speak(); //greeter 인터페이스의 추상메소드만 사용가능 
		p3.greet();
		
	}

}
