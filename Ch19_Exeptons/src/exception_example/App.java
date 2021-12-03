package exception_example;

public class App {

	public static void main(String[] args) throws InterruptedException {
//		자바 예외 (Exception)
		System.out.println("하나");
		Thread.sleep(2000);//2초대기
//		Unhandled exeption type InterruptedExcetion 오류 발생
//		2가지 방법을 제시한다.
//		1. add throws declaration 선택
//		main뒤에 throws InterruptedException : 이런 예외가 발생하면 이렇게 처리하겠다.
//		2. surround with try/catch
		System.out.println("둘");
		
	}

}
