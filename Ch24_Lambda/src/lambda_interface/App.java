package lambda_interface;

import java.util.function.Predicate;

public class App {
	public static void main(String[] args) {
		// predicate 사용하기(predicate는 정의되어있음)
		// predicate : 제네릭 타입
		Predicate<String> p1 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				// 입력된 타입의 객체를 검사해서 참/거짓으로 리턴
				return t.length() < 4;
			}
		}; // 여기까지 정의
		
		// 사용하기
		System.out.println(p1.test("abcd"));
		System.out.println(p1.test("가나다"));
		
		//람다식
		Predicate<String> p2 = t -> t.length() < 4;
		// 사용하기
		System.out.println(p1.test("abcd"));
		System.out.println(p1.test("가나다"));
	}
}
