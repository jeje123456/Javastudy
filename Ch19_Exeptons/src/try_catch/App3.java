package try_catch;

import java.util.Scanner;

public class App3 {
	
	private static Scanner scanner = new Scanner(System.in);
	// static 메소드로 만들면 사용할 때 객체선언 안해도됨
	
	public static void main(String[] args) {
		// 예외를 처리하는 try-catch 문
		
		int number = getNumber();
		System.out.println("입력한 숫자는 : " + number);
		scanner.close();
	}
	 	//숫자를 입력받아서 리턴하는 메소드 작성
	private static int getNumber() {
		int number = 0;
		boolean isNumber = false;
		
		// 숫자를 입력할때까지 반복하는 do while문 사용
		do {
			System.out.print("숫자를 입력 :");
			String line = scanner.nextLine();
			
			try { // 예외가 발생 할 수 있는 코드를 적음
				number = Integer.parseInt(line);
				isNumber = true; // 숫자가 입력됨
			} catch (NumberFormatException e) { 
				System.out.println("정수로 변환할 수 없습니다.");
			}
				
		} while(!isNumber); // 숫자가 아니면 반복
		
		return number;		
	}
}