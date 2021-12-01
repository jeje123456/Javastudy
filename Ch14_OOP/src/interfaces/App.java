package interfaces;

public class App {
	
	public static void main(String[] args) {
		// 인터페이스
//		object[] objs = {new Person(), new Computer()};

//		Describable ds = new Describable(); //객체를 만들수 없다.
		Describable[] objs = {new Person(), new Computer()};
		
//		for(object ob : objs) {
//			System.out.println(ob);
//		}
		for(Describable ob : objs) {
			System.out.println(ob.getDescription());
		}

	}

}
