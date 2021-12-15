package stream_example;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(6);
		numbers.add(3);
		// 스트림 안써도 똑같이 나옴
		numbers.forEach(System.out::println);
		System.out.println();
		// 스트림을 쓴 메소드 레퍼런스 식
		numbers.stream().forEach(System.out::println);
		System.out.println();
		
		numbers.stream()
				.filter(i -> i<5)
				.forEach(System.out::println);
		System.out.println();
		
		numbers.stream()
				.filter(i -> i<5)
				.map(i -> i * i)
				.forEach(System.out::println);
				
//		// 람다식
//		numbers.stream().forEach(n -> System.out.println(n));

	}

}
