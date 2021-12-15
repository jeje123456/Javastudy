package lambda_example;

// 추상메소드가 1개인 인터페이스 만들기 -> 람다식 사용가능
interface Runner{
	void execute(); 
}

public class App2 {
	public static void main(String[] args) {
//		Runner run = (매개변수) -> {실행식};
//		Runner run = () -> {
//			System.out.println("헬로우");
//			System.out.println("람다식");
//		};
		// 코드가 한줄일때는 코드블록{} 생략가능
		Runner run = () -> System.out.println("한줄");
		run.execute();
		
		System.out.println(run instanceof Runner);
		// run은 Runner의 객체가 맞는지 확인 -> true
		System.out.println(run.getClass());
		// run의 실제 클래스는? -> 클래스는 람다식
	}
}
