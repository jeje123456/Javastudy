package application;

import java.util.Scanner; // java.util 패키지 안에 Scanner 클래스를 불러와서 사용가능
//Scanner 클래스
//: 읽은 바이크를 문자, 정수, 실수, 불린 문자열 등 다양한 타입으로 변환하여 리턴하는 클래스

public class UserInput {

	public static void main(String[] args) {
		// 입력받는 클래스 UserInput만들기
		// Scanner + ctrl + spacebar
		Scanner scanner = new Scanner(System.in); //스캐너 객체를 선언
		
		System.out.print("온돌를 입력해 주세요 : ");
		double c = scanner.nextDouble(); //스캐너로 정수를 입력받아서 x에 입력
		//실행 시 입력을 대기하고 엔터키가 입력되면 종료 // scanner.nextInt() = 메소드
		//console의 빨간 네모는 프로그램이 int x앞에서 대기중이라는 이야기.
		double f = (c * 9 / 5) + 32; // 화씨 변수 f는 공식대로
		
		System.out.printf("섭씨 %.1f 는 화씨 %.1f 이다.", c, f);
	}

}
