package enum_example;

public class App {

	public static void main(String[] args) {
		// enum을 클래스처럼 사용한다.
		Fruit f1 = Fruit.APPLE;
		Fruit f2 = Fruit.ORANGE;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1 == f2);
		
	}
}
