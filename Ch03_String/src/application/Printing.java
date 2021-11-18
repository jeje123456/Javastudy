package application;

public class Printing {

	public static void main(String[] args) {
		// 문자열 더하기(+), 출력
		String name = "홍길동";
		System.out.println("너의 이름은 " + name); //문자열끼리 + 로 더한다
		
		String text = "너의 이름은 : ";
		String endOfSentence = ".";
		
		System.out.println(text + name + endOfSentence);
	}

}
