package lambda_parameter;

interface Runner{
	// 추상메소드에 매개변수가 있는 경우
	void execute(String t);
}

public class App {
	public static void main(String[] args) {
		// 인터페이스의 추상메소드에 매개변수가 있는 경우
		Runner run1 = (s) -> System.out.println(s);
		run1.execute("라이언 골드");
		
		// 매개변수가 1개일때는 괄호( ) 생략가능
		Runner run2 = x -> System.out.println(x);
		run2.execute("일주일만 쉬고싶다");
		
	}
}
