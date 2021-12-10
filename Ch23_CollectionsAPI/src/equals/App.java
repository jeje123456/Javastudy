package equals;

import java.util.Objects;

class Person{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	// 우클릭 - 소스 - generate hashCode() and equals()클릭

}

public class App {
	public static void main(String[] args) {
		// 같은지 비교하는 메소드
		Person p1 = new Person("펭수");
		Person p2 = new Person("펭수"); // p1과 p2는 이름은 같지만 다른 객체
		
		System.out.println(p1 == p2); // false
		System.out.println(p1.equals(p2)); // true

	}
}
