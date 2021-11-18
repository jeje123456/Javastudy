package basic;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("메뉴\n");
		System.out.print("==== \n\n");
		System.out.print("1. 프린트 '헬로우'\n");
		System.out.print("2. 프린트 '안녕 ?'\n");
		System.out.print("3. 프로그램 종료\n\n");
		System.out.print("옵션을 선택 > ");
		int option = scanner.nextInt();
		
		if (option == 1) {
			System.out.println("헬로우");
		}
		else if (option == 2) {
			System.out.println("안녕 ?");
		}
		else if (option == 3) {
			System.out.println("종료합니다...");
		}
		else if (option == 10000) {
			System.out.println("이스터에그를 발견했습니다!");
		}
		else {
			System.out.println("잘못된 옵션입니다.");
		}
		
	}

}
