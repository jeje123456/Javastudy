package abstract_Class;

//추상 클래스는 클래스 앞에 abstract 붙여서 선언
public abstract class GameObject {
	// 추상메소드 describe()
	public abstract void describe();
	//추상 메소드는 메소드 안에 내용이(코드가) 없다
	//= 추상 메소드는 메소드는 몸체가 없다 -> 상속받은 클래스에서 작성	
	//추상클래스에 선언된 추상 메소드는 상속받은 하위 클래스에 강제적으로 구현
	//추상 클래스를 상속 받았을 경우 추상 메소드를 구현해야(만들어야)한다.
}
