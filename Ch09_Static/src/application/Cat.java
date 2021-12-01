package application;

public class Cat {
	//변수
	private String name; // cat의 객체를 사용해야 쑬 수 있는 변수
	private int id; //아이디 (고유번호 = 중복안됨)
	
	// 스테틱 변수는 객체들에 공유됨
	public static int count=0;
	//private static int count=0;
	// final(상수) 사용하면 변수명을 대문자로
	public static final String FOOD = "고양이사료";	

	public Cat(String name) {
		this.name = name;
		count++;
		id = count; // 객체가 만들어질때마다 카운트값이 증가하면서 저장
	}
	
//	@Override
//	public String toString() {
//		return "Cat [name=" + name + "]";
//	}

	// 스테틱 메소드
	public static int getCount() {
		// 스테틱 메소드는 객체가 만들어지기 전에 사용하므로
		// 스테틱 메소드는 인스턴스(객체) 변수를 사용 불가
		// string s = name;
		return count; //static 변수는 사용 가능
		
	}

	@Override
	public String toString() {
		return "Cat [이름 : " + name + ", id : " + id + "]";
	}
	
}
