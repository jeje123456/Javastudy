package treeSet;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	public String toString(){
		return name;
	}
	@Override
	public int compareTo(Person o) {
	// 이름을 문자열로 비교(이미 문자열에 비교메서드 compareTo가 구현되어 있음)
		return name.compareTo(o.name);
	}
}

public class App {

	public static void main(String[] args) {
		// TreeSet 은 정렬 기능 추가
		// TreeSet에 마우스 올리면 뜨는 설명에 must comparable of interface라고 나옴
		TreeSet<Person> people = new TreeSet<>();
		people.add(new Person("펭수"));
		people.add(new Person("라이언"));
		people.add(new Person("가가멜"));
		people.add(new Person("스머프"));
		
		for(Person p : people) {
			System.out.println(p); 
		} // Exception 발생 - 비교가능한 객체이어야 함
		// class Person implements Comparable<Person>로 수정
		// compareTo 메소드 작성 -> 이름으로 비교 -> Exception 안생김
		
		
		TreeSet<Integer> list = new TreeSet<>();
		list.add(10);
		list.add(7);
		list.add(1);
		list.add(8);
		list.add(9);
		
		for(int i : list) {
			System.out.println(i);
		}
	}
}
