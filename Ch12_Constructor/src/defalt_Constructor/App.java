package defalt_Constructor;

public class App {

	public static void main(String[] args) {
		// 디폴트 생성자
/*		Person p = new Person(); //person생성자 수정 후 매개변수 없어서 에러
		System.out.println(p);
		//System.out.println(p.toString); 인데 .toString 생략되어있음
*/
/*		Person p = new Person("홍길동");
		System.out.println(p);
*/	
		Person p1 = new Person();
		System.out.println(p1);
		Person p2 = new Person("펭수");
		System.out.println(p2);
		Person p3 = new Person("라이언", 35);
		System.out.println(p3);
	}

}
