package inheritance;

//Animal=부모 = 슈퍼클래스 | Bird=자식 = 서브클래스
public class Bird extends Animal{ //자식클래스는 부모클래스를 상속한다.(키워드 extends)
	public void fly() {
		System.out.println("하늘을 난다.");
	}

}
