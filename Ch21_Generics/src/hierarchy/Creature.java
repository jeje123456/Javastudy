package hierarchy; // hierarchy = 계층

public class Creature {
	// 필드변수, 인스턴스변수 : 클래스에 선언한 변수
	private String name; 
	// 생성자 : 메소드명 앞에 리턴타입이 없다
	public Creature(String name) { 
		this.name = name;
	}
	// toString 메소드 (객체변수 출력시 실행(생략))
	public String toString() { 
		return name;
	}
	// feed메소드
	public void feed() { 
		System.out.println("생물이 먹이를 먹는다...");
	}
}
