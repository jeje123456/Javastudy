package application;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// 스캐너 불러오기
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사과의 갯수는? : ");
		int apple = scanner.nextInt();
		System.out.println("바나나의 갯수는? : ");
		int banana = scanner.nextInt();
		scanner.close(); //스캐너 종료(더이상 안쓸때)
		// if(조건문){명령문;}
		if(apple > banana) {//거짓이면 아래 문구 출력 없이 마지막 문구만 출력
			System.out.println("사과가 바나나보다 많다.");
		}
		if(apple < banana) {//거짓이면 아래 문구 출력 없이 마지막 문구만 출력
			System.out.println("바나나가 사과보다 많다.");
		}
		System.out.println("프로그램 종료.");
		
		// 예제. Scanner스캐너 객체를 이용해 사과의 갯수와 바나나의 갯수를 입력받고 결과 출력
		
	}

}
