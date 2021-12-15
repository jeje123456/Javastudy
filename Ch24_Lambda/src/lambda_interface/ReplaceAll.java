package lambda_interface;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAll {

	public static void main(String[] args) {
		// 리스트의 값을 연산결과로 대체한다.
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);
		
//		numbers.replaceAll(new UnaryOperator<Integer>() {
//			@Override
//			public Integer apply(Integer n) {
//				return n * n;
//			}
//		});
		// 람다식
		numbers.replaceAll(n -> n * n);
		numbers.forEach(n -> System.out.println(n));
		// String으로 해보자
		List<String> friends = new ArrayList<>();
		friends.add("삼색이");
		friends.add("도도");
		friends.add("마릴린");
		friends.add("야통이");
		friends.add("길막이");
			
		friends.replaceAll(s -> "안녕~ " + s);
		friends.forEach(s -> System.out.println(s));
	
	}

}
