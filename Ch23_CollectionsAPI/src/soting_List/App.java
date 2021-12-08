package soting_List;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		// 리스트를 정렬
		ArrayList<Double> doubles = new ArrayList<>();
		
		doubles.add(7.38);
		doubles.add(3.88);
		doubles.add(1.45);
		doubles.add(2.35);
		doubles.add(9.78);
		
		doubles.forEach(System.out::println);
		System.out.println("--------");
		
		Collections.sort(doubles); // Collections를 사용하여 정렬
		doubles.forEach(System.out::println);
		
		// 기본타입 숫자등은 값으로 정렬, 문자열, 문자 등은 알파벳순 정렬 한글은 가나다순 정렬
		// 기본타입이 아닐 경우
		// 커스텀 객체의 정렬
		ArrayList<Person> people = new ArrayList<>();
		// 1. 객체를 생성하여 입력
	
		people.add(new Person("펭수"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));
		people.add(new Person("고길동"));

		Collections.sort(people); // 정렬불가 -> person 수정 -> 정렬가능
		people.forEach(System.out::println);
	}
}
