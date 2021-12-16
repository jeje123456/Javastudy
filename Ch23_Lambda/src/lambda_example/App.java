package lambda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {
		// 문자열 어레이 리스트 생성
		List<String> list = new ArrayList<>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		// forEach반복문의 매개변수로 consumer입력
		// consumer : 인터페이스
		// 인터페이스는 객체를 못만드므로 익명클래스로 추상메소드 구현
		// list와 같이 String 타입으로 설정
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// 익명클래스에서 추상메소드를 구현
				System.out.print(t + "\t");	
			}
		});
		System.out.println();
		
		// 익명클래스를 람다식으로 만들어보자
		// 매개변수 t
		// 매개변수로 functional interface가 있을때 
		// 추상메소드(accept)를람다식으로 바꿀수 있다.
		list.forEach(t -> System.out.print(t + "\t"));
		
	}
}
