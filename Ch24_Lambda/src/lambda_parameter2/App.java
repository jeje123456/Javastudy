package lambda_parameter2;

interface Runner{
	// 추상메소드에 매개변수가 2개 있는 경우
	void execute(String name, String text);
}

public class App {
	public static void main(String[] args) {
		// 인터페이스의 추상메소드에 매개변수2개 있는 경우
		Runner run1 = (n, t) -> System.out.printf("%s 님 %s", n, t);
		run1.execute("라이언 골드", "일주일만 쉬고싶다");	
		
		System.out.println();
		
		greet(run1);
	}

	private static void greet(Runner run1) {
		run1.execute("라이언 골드", "드라마 보고싶다");
	}
}
