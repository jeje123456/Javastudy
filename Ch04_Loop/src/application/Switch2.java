package application;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계속 진행하겠습니까? (y/n) : ");
		String input = scanner.nextLine();
		scanner. close();
		
		switch(input) {
		case "y": //문자를 입력 받기 때문에 따옴표("") 사용
			System.out.println("진행합니다.");
			break; 
		case "n":
			System.out.println("종료합니다.");
			break;
		default: 
			System.out.println("잘못된 입력입니다.");
			break;
		}

	}

}
