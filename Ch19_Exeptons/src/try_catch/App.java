package try_catch;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 예외를 처리하는 try-catch 문
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("숫자를 입력 :");
//		int line = scanner.nextInt();
//		문자 입력시 Exception 오류발생
		
		System.out.print("숫자를 입력 :");
		String line = scanner.nextLine();
		scanner.close();
//		System.out.println(line);	
		
		int number = 0;
//		try +c+s
/*		try { // 예외가 발생 할 수 있는 코드를 적음
			number = Integer.parseInt(line);
//			Integer란? 
//			Integer. = 문자열을 정수로 변환
//			Double.parseDouble(line);
//			Float.parseFloat(line);
		} catch (Exception e) { // 예외 발생시 프로그램 종료가 아니라 여기로 이동
			System.out.println("예외발생");
		}	*/

		try { // 예외가 발생 할 수 있는 코드를 적음
			number = Integer.parseInt(line);
			/*	Integer란? 
			Integer. = 문자열을 정수로 변환
			Double.parseDouble(line);
			Float.parseFloat(line); */	
		} catch (Exception e) { // 예외 발생시 프로그램 종료가 아니라 여기로 이동
			System.out.println("숫자가 아닙니다");
		}
		
		System.out.println("입력한 숫자는 : " + number);

	}

}
