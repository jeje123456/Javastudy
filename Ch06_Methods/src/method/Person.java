package method;

public class Person {
	// 클래스 안의 일반 변수 = 인스턴스 변수 (객체 생성시 생성됨) ;
	int age;
	String name;
	// 클래스 안에 만든 함수를 메소드라고 부름. -> 객체 생성시 생성되어서 사용가능해짐
	//sayHello라는 메소드 생성(함수인데 클래스안에 있으면 메소드라고 부름)
	void sayHello() {
		System.out.println("헬로우!" + name);
	}
	
}
