package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// 패스워드가 틀리더라도 3번 입력할 수 있는 기회를 준다.
		// 패스워드가 맞으면 '접속승인'을 출력하고 반복문을 빠져나옴.
		// 패스워드가 3회 틀릴시 '접속거부'
		
		final String USER_PASSWORD = "hello";
		Scanner scanner = new Scanner(System.in);
				
		boolean accessOK = false;
		//플래그(flag):불린 변수로 상태에 따라 처리흐름 제어
		//여기에 코드 작성 비번이 맞으면 accessOK = true;로 하고
		//'접속승인'을 출력
		
		for(int i=0; i<3; i++) {
			System.out.print("비밀번호 입력 : ");
			String password = scanner.nextLine();
			
			if(password.equals(USER_PASSWORD)) {
				scanner.close();
				System.out.println("접속승인");
				accessOK = true;
				break;
			}
			else {
				System.out.printf("비밀번호가 %d번 틀렸습니다.", i+1);
			}
		}
		 scanner.close();
		 
		 if(!accessOK) {
		// if(true) 일때 출력되는데 위에서 accessOK가 true로 변환되면
		// if(false)가 되어서 {}안의 내용이 실행 안됨
				System.out.println("접속거부");
		}
	
		// 불리언 없어도 실행됨.
//		 
//		final String USER_PASSWORD = "hello";
//		String password = "";
//		Scanner scanner = new Scanner(System.in);
//			
//		for(int i=0; i<3; i++) {
//			System.out.print("비밀번호 입력 : ");
//			password = scanner.nextLine();
//				
//			if(password.equals(USER_PASSWORD)) {
//				scanner.close();
//				System.out.println("접속승인");
//				break;
//			}
//			else {
//				System.out.printf("비밀번호가 %d번 틀렸습니다.", i+1);
//			}
//		}
//		scanner.close();
//			 
//		if(!password.equals(USER_PASSWORD)) {
//		// if(false)가 되어서 {}안의 내용이 실행 안됨
//			System.out.println("접속거부");
//		}
	}	
}
