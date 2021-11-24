package getterSetter;

public class App {

	public static void main(String[] args) {
		// 인스턴스 변수에 접근하는 메소드 get과 set
		Person p1 = new Person();//메모리에 올라간 객체
		
		// 보안상 객체의 변수에 바로 접근하지 못함
		// (객체지향언어에서 하나의 프로그램 규칙)
		// Person에 private 설정
		// p1.name = "펭수"; 쓸 수 없어짐
		p1.setName("펭수");
		System.out.println(p1.getName());
		
		p1.setAge(25);
		System.out.println(p1.getAge());
		
		Person p2 = new Person();
		p2.setName("길동");
		System.out.println(p2.getName());
		
		p2.setAge(17);
		System.out.println(p2.getAge());
		
	}

}
