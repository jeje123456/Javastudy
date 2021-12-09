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
	@Override
	public boolean equals(Object obj) { // Object는 비교할 다른 객체
		if(this == obj) // 객체가 같을 경우
			return true; 
		if(obj == null) // 비교대상이 null값이면
			return false;
		if(getClass() != obj.getClass()) // 클래스 타입이 다를경우 false 
			return false;
		Person other = (Person)obj;
		return Objects.equals(name, other.name);// 위의 3가지 경우가 아닐 경우에 이름으로 
	}
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
