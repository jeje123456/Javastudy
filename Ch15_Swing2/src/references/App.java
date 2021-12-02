package references;

class Person{
	
}

public class App {

	public static void main(String[] args) {
		Person p1 = new Person(); //p1= 레퍼런스 변수
		System.out.println(p1);
		
		Person p2 = p1;	// p2 = 레퍼런스 변수
		System.out.println(p2);
		
		test(p2);
		//오류 클릭 create test
	}
//	test메소드
	private static void test(Person p) {
		System.out.println(p); //매개변수로 입력된 p의 주소를 출력
		//	p1주소 = p2주소 = p주소
	}
	
}
