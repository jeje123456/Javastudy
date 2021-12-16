package hashset;

import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {
		//링크드해시셋은 중복이 안되고 입력된 순서대로 출력됨
		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		
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

		}
	}
}
