package constructorsParameter;

public class App {

	public static void main(String[] args) {
		// 생성자 : 클래스의 특별한 메소드
		Person p1 = new Person("펭수", 120); 
		Person p2 = new Person("길동", 175.5);
		Person p3 = new Person("라이언", 183);
		Person p4 = new Person();

//		System.out.printf("이름 : %s, 키 : %f\n", p1.getName(), p1.getHeight());
//		System.out.printf("이름 : %s, 키 : %f\n", p2.getName(), p2.getHeight());
//		System.out.printf("이름 : %s, 키 : %f\n", p3.getName(), p3.getHeight());
//		System.out.printf("이름 : %s, 키 : %f\n", p4.getName(), p4.getHeight());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}

}
