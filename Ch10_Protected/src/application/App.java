package application;

//import entities.Apple;
//import entities.Banana;
//import entities.Fruit;
import entities.*; //entities안에 있는 모든 클래스

public class App {

	public static void main(String[] args) {
// 프로텍트 protected 접근지정자 사용시 다른 패키지에서 사용할 수 없고
// 상속 받은 자식크래스에서만 사용 가능하다.
		//Fruit + ctrl + space
		//Apple + ctrl + space	
		Fruit f1 = new Apple();
//		f1.id = 7; //id는 protected라서 사용불가
		System.out.println(f1.toString());
		
		Fruit f2 = new Banana();
		System.out.println(f2.toString());
	}

}
