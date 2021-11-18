package application;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// if else문
		Scanner scanner = new Scanner(System.in);

		System.out.println("사과의 갯수는? : ");
		int apple = scanner.nextInt();
		System.out.println("바나나의 갯수는? : ");
		int banana = scanner.nextInt();
		scanner.close();
		// if(조건문){명령문;}
		if(apple > banana) {//진실이면 아래 문구 출력
			System.out.println("사과가 바나나보다 많다.");
		}
		else {//if문의 조건이 거짓일 경우 아래 문구 출력
			System.out.println("바나나가 사과보다 많다.");
		}
		System.out.println("프로그램 종료.");

	}

}
