package application;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		// TODO else if문
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
		else if (apple == banana) {// 또 다른 조건은 else if(조건문){명령문}을 사용한다.
			System.out.println("사과와 바나나의 갯수가 같다");
		} // else if 여러개 사용 가능
		else {//위의 조건문이 모두 거짓일 경우 아래 문구 출력
			System.out.println("바나나가 사과보다 많다.");
		}
		System.out.println("프로그램 종료.");
	}

}
