package method;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		// 클래스에는 초기값을 안넣어도 에러안남.
		// 인스턴스 변수에 값이 없을 때 자동으로 0, null로 초기화됨
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		// 메소드에 출력문이 있기때문에 따로 출력문을 생성하지 않아도 된다.
		p1.sayHello(); // 메소드 호출
		
		p1.name = "펭수";
		p1.age = 7;
		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		p1.sayHello(); // 메소드 호출
		
		Person p2 = new Person();
		p2.name = "라이언";
		
		p2.sayHello();
		
	}

}
