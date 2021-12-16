package soting_List;
// 정렬을 할수있게 Comparable로 비교가능한 인터페이스 구현
public class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	// Ctrl + Space
	@Override
	public int compareTo(Person o) {
		// 객체끼리 비교해서 누가 큰지 코드 작성
		return name.compareTo(o.name);
		// 문자열끼리 비교하는 메소드 compareTo 사용하여 
		
		// compareTo는 int 타입으로 작으면 -1 크면 1 이런식으로 비교값 나와서 정렬가능
	}
}
