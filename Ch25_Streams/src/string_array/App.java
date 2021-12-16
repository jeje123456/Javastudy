package string_array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
	public static void main(String[] args) {
		// 리스트일 경우 리스트.stream()
		// 리스트가 아닐 경우 : 
		// 1. Stream.of(1,2,3) 정수형 스트림 
		//	  Stream.of('하나','둘') 문자열 스트림
		// 2. 배열일 경우 Array.stream(배열입력)
		String[] items = {"고양이","호랑이","고라니","치타","치약","치과"};
		Stream.of(items) // 배열을 입력해서 스트림 생성
			.filter(s -> s.startsWith("치")) // 필터는 참 값만 남긴다.
			// startsWith("치") = 문자열의 시작이 "치"인것을 참으로 분류 
			.forEach(x -> System.out.print(x + ", "));
		System.out.println();
		System.out.println();
		// 배열을 stream으로 만들기
		int[] numbers = {2,4,6,8,10};
		Arrays.stream(numbers) // 배열 stream 생성
			.map(n -> n*n)
			.forEach(n -> System.out.print(n + ", "));
		System.out.println();
		
		int[] nums = {9,4,6,3,1,2,7};
		Arrays.stream(nums)
			.filter(n -> n > 3)
			.sorted()
			.map(s -> s * 10)
			.forEach(i -> System.out.print(i + ", "));
		System.out.println();
		
		// 정수배열을 new로 생성과 동시에 초기화
		Arrays.stream(new int[] {2,4,6,8,10}) 
			.map(n -> n*n) // 제곱
			.average()	   // 평균 , max(), min() 가능
			.ifPresent(n -> System.out.println(n));
		System.out.println();
		
		// 배열을 리스트로
		//List<String> list = Arrays.asList("고양이","고라니","치타");
		List<String> list = Arrays.asList(items);
		list.stream()
			.filter(x -> x.startsWith("고")) // 고양이, 고라니
			.sorted()						// 정렬 : 고라니, 고양이
			.forEach(x -> System.out.print(x + ", "));
		System.out.println();
		
		// 정수배열을 리스트로
		List<Integer> number = Arrays.asList(9,4,6,3,1,2,7);
		number.stream()
			.filter(n -> n > 3)
			.sorted()
			.map(s -> s*10)
			.forEach(i -> System.out.print(i + ", "));
	}
}
