package application;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// do while은 처음 한번은 조건과 상관없이 실행
		
//		int count = 100;
//		int count2 = 0;
//		
//		System.out.println("do while 반복문");
//		
//		do {
//			System.out.println("Count : " + count);
//		} while (count++ <5);
//		do {
//			System.out.println("카운트 : " + count2);
//		} while (count2++ <5);
//		
		final String USER_PASSWORD = "hello";
		String password = ""; //문자열 선언과 초기값 공백(null)으로 선언
		// 코드블록{} 안에서 선언된 변수는 밖에서 사용불가 = 지역변수
		// 밖에서 선언된 변수는 코드블록{} 안에서 사용가능 = 전역변수
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("비밀번호 입력 : ");
			password = scanner.nextLine();
		} while(!password.equals(USER_PASSWORD));
		// !true는 false이고 !false는 true이다.
		scanner.close();
		System.out.println("접속승인");
	}

}
