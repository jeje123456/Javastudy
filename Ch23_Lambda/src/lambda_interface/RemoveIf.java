package lambda_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {

	public static void main(String[] args) {
		// 특정 타입(제네릭)을 검사해서(test) boolean 참, 거짓으로 리턴
		List<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(9);
		numbers.add(10);
		numbers.add(4);
		
		// 리스트 넘버즈 안에 있는 정수들 중에 6보다 작으면 다 제거
		// removeIf 메소드는 predicate로 검사(test)해서 참이면 다 제거한다.
		numbers.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer i) {
				return i < 6; // 정수가 6보다 작으면 참이다.
			}
		});
		// 람다식
		numbers.removeIf(i -> i < 6);
		
		numbers.forEach(x -> System.out.println(x));
		
		// predicate 한번더 사용
		
		List<String> sList = new ArrayList<>();
		sList.add("하나둘");
		sList.add("하나둘셋");
		sList.add("하나");
		sList.add("하나둘셋넷다섯");
		
		// 문자열 길이가 4보다 작으면 다 제거 -> 참이면 다 제거 = 필터역할
		sList.removeIf(s -> s.length() < 4);
		sList.forEach(s -> System.out.println(s));
	}

}
