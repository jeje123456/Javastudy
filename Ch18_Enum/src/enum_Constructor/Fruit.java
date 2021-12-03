package enum_Constructor;

//클래스 대신 enum이라고 붙여주면 enum클래스
public enum Fruit { //keyword가 enum
	APPLE("빨간색"), BANANA("노란색"), ORANGE("주황색"); //상수들의 집합 (0, 1, 2 인덱스번호)
//	위에는 상수이기때문에 이미 값이 결정되어있는것.
//	상수를 객체라고 생각하자.
//	생성자를 만들어주게 되면 괄호안에 값이 입력된다.
	
//	fruit enum생성자 만들기
	private String color;

	Fruit(String color) { // enum의 생성자
		this.color = color;
	}

	public String toString() {
		return super.toString().toLowerCase() + " (" + color + ")";
	}
//	super.는 상위클래스
//	toLowerCase() = 소문자로 변환해서 출력
}
