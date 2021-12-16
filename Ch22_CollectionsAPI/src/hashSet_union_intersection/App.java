package hashSet_union_intersection; // 합집합(union), 교집합(intersection)

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		HashSet<String> list1 = new HashSet<>();		
		list1.add("사과");
		list1.add("배");
		list1.add("딸기");
		list1.add("수박");
			
		HashSet<String> list2 = new HashSet<>();		
		list2.add("체리");
		list2.add("배");
		list2.add("오렌지");
		list2.add("사과");	
		// 합집합
		HashSet<String> union = new HashSet<String>(list1);
		// 처음 생성시 list1을 입력해서 생성하고 add메소드로 list2 입력
		union.addAll(list2); // 리스트1 + 리스트2 (중복아이템은 삭제)
		union.forEach(System.out::println);
		System.out.println("-------");
		// 교집합
		HashSet<String> intersection = new HashSet<String>(list1);
		intersection.retainAll(list2); // 리스트1과 리스트2에 중복되는 것들만 남김
		intersection.forEach(System.out::println);
		System.out.println("-------");
		// 마이너스
		HashSet<String> minus = new HashSet<String>(list1);
		minus.removeAll(list2); // list1 - list2 = list1에서 중복되는 값이 빠짐
		minus.forEach(System.out::println);
		
	}

}
