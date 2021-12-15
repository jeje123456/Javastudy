package example;

import java.util.ArrayList;
import java.util.List;

public class App3 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(6);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);
		numbers.add(6);
		numbers.add(3);
	
//		numbers.removeIf(i -> i < 5);
//		numbers.replaceAll(i -> i * 2);
//		numbers.forEach(i -> System.out.println(i));
		
		// 람다식을 메소드 레퍼런스로 바꾸기
		numbers.removeIf(App3::filter);
		numbers.replaceAll(App3::map);
		numbers.forEach(System.out::println); //메소드 레퍼런스
	}
	private static boolean filter(int i) {
		return i < 5;
	}
	private static int map(int i) {
		return i * 2;
	}
	
}
