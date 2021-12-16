package collections;

public class Wrapper<E> {
/*	// 변수 선언
	private Object object;
	// 값을 입력하는 메소드
	public void set(Object object) {
		this.object = object;
	}
	// 값을 출력하는 메소드
	public Object get() {
		return object;
	}
*/	// 제네릭 타입 클래스 Wrapper -> 클래스 명 뒤에 <E> 삽입
	// Object 대신 E로 수정, E타입 = 제네릭 타입
	// 타입을 런타임에 지정
	// 변수 선언
	private E object;
	// E타입의 set 메소드
	public void set(E object) {
		this.object = object;
	}
	// E타입의 get 메소드
	public E get() {
		return object;
	}
}
