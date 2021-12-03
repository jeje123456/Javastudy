package enum_methods;

import enum_Constructor.Fruit;

public class App {

	public static void main(String[] args) {
		// enum에서 사용하는 메소드
		// values()
		Fruit[] fruits = Fruit.values();
//		Fruit.values 에서 .values = values메소드
//		enum.values() -> enum의 모든 상수들을 배열로 리턴한다.
//		배열안의 내용을 꺼낼때는 for반복문 or for each 반복문 사옹		
		for(Fruit f : fruits) {
			System.out.println(f);
		}
		
//		위의 선언부터 반복문까지를 간단하게 수정
		for(Fruit f : Fruit.values()) {
			System.out.println(f);
		}
		
//		ordinal() : enum에 있는 상수의 순서(인덱스번호) = 정수로 리턴
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		
//		valueOf("문자열")
		Fruit f1 = Fruit.valueOf("ORANGE");
		System.out.println(f1);
		System.out.println(f1 = Fruit.ORANGE);
//		이 오렌지가 그 오렌지냐? true
	
	}
}
