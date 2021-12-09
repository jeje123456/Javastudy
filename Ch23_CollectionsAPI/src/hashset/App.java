package hashset;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		// Set타입은 중복이 안되고 순서가 없다. 인덱스 번호도 없다.
		// HashSet은 제네릭타입
		HashSet<String> fruits = new HashSet<>();
		
		fruits.add("사과"	);
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과"	);
		fruits.add("사과"	);
		
		// 같은 값이 있으면 true
		System.out.println(fruits.contains("오렌지")); 
		
		for(var f : fruits) {
			System.out.println(f); 
		} // 순서대로 입력되어있지 않음, 중복없음
	}
}
