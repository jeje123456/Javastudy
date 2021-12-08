package hierarchy;

public class Mammal extends Creature {
	//Creature에 문자열 이름이 들어가는 생성자가 있기때문에 오류 발생 -> 눌러서 생성자 생성
	
	public Mammal(String name) {
		super(name); //부모 클래스 Creature을 생성할때 이름 name이 입력되야 함.
	}	
}
