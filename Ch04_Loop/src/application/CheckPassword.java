package application;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// 유저가 입력한 패스워드를 설정한 패스워드와 비교
		// 지정된 패스워드 입력시 '접속승인' 아니면 '접속불가'
		final String USER_PASSWORD = "hello";
		
		System.out.print("비밀번호 입력 >");
		
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		scanner.close();
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("접속승인");
		}
		else {
			System.out.println("접속불가");
		}
				
		
	}

}
