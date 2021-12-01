package this_Constructor;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		System.out.println(p1);
		Person p2 = new Person("펭수");
		System.out.println(p2);
		Person p3 = new Person("라이언", 35);
		System.out.println(p3);
	}

}
