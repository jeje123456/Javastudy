package arrayList;

import java.util.ArrayList;

public class Interating {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(7);
		list.add(9);
		list.add(123);
		
		//반복문 for each문 : 간단하게 출력하고 싶을때 사용
		for(Integer n : list) {
			System.out.println(n);
		}
		System.out.println();
		// for 반복문 : 인덱스 번호가 필요할 때 사용
		for(int i=0; i<list.size(); i++) {
			Integer n = list.get(i);
			System.out.println(i + " : " + n);
		}
		System.out.println();
		// 컬렉션 객체.for each문 (각각 반복), 람다식
		list.forEach(System.out::println);
		System.out.println();
		// 메소드 레퍼런스 (나중에 배울꺼임)
		list.forEach(System.out::println);
	}
}

