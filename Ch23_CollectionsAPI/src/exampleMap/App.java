package exampleMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Person implements Comparable<Person>{
	// Person의 이름으로 equals메소드를 만들어 key값의 중복을 이름으로 하도록한다.
	// 이름이 같으면 중복 안되도록!!
	private String name;

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		// 이름으로 정렬
		return name.compareTo(o.name);
	}
}

public class App {

	public static void main(String[] args) {
		// Map을 사용한 예제
		Map<Person, Boolean> people1 = new HashMap<>();
		Map<Person, Boolean> people2 = new LinkedHashMap<>();
		Map<Person, Boolean> people3 = new TreeMap<>();
		
		// 맵에서 키값으로 중복을 결정하는데 
		// Person클래스에서 equals메소드를 만들어서 이름이 같으면 중복이 되게 수정됨
		inputMap(people1); // 오류 눌러서 메소드를 만들어서 입력해보자
		displayMap(people1);
		
		inputMap(people2);
		displayMap(people2);
		
		inputMap(people3); 
		displayMap(people3);
		// Exception 발생 -> Person에 정렬기능(비교) 메소드가 없다
		// 트리맵은 정렬을 하는데 이때 key값인 Person클래스에서
		// Comparable 인터페이스를 구현해야한다.
		// Comparable 인터페이스 구현 -> 가나다 순으로 정렬됨 
		
		
	}

	private static void displayMap(Map<Person, Boolean> map) {
		// 맵의 키와 value값을 출력한다.
		map.forEach((k,v) ->System.out.println(k + " : " + v));
		System.out.println();
	}

	private static void inputMap(Map<Person, Boolean> map) {
		// 다른 맵들도 쓸수 있도록 HashMAp을 Map타입으로 변경
		// 매개변수 people1은 map으로 변경
		// Map에 Person 객체와 boolean으로 원격여부를 입력
		map.put(new Person("삼색이"), true);
		map.put(new Person("도도"), true);
		map.put(new Person("마릴린"),true);
		map.put(new Person("무"), false);
		map.put(new Person("래기"), false);
		map.put(new Person("무"), true);
		// 중복됨 -> Person 수정 -> equals
	}

}
