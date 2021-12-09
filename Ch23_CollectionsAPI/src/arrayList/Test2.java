package arrayList;


import java.util.LinkedList;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
			// 입력한 숫자들의 평균값을 출력하라.
			// 평균값 구하는 공식 total / numbers.size()
			Scanner scanner = new Scanner(System.in);
			double total = 0;
			
			LinkedList<Double> numbers = new LinkedList<>();
			while(true) {
				System.out.println("숫자 또는 'q' 입력 > ");
				String input = scanner.nextLine();
				input = input.trim();			  // equal 넣으면 소문자만 인정
				if(input.equalsIgnoreCase("q")) { // equalsIgnoreCase : 대소문자 상관없음
					System.out.println("q 입력 프로그램 종료");
					scanner.close();
					System.out.println("입력된 숫자의 평균 값 : " + total / numbers.size());
					break;	
				}
				try {
					double value = Double.parseDouble(input); // parseDouble() : 문자열을 실수로 변환
					numbers.add(value); // 실수로 변환된 값을 리스트에 입력
					total += value;
				} catch (Exception e) {
					System.out.println("숫자가 아닙니다.");
				}
				System.out.println();
				
				if(numbers.size()<0) {
					System.out.println("입력된 숫자 : ");
					for(Double number : numbers) {
						System.out.printf("%.2f\n", number);
					}
				} else {
					System.out.println("숫자가 입력되지 않음!");
				}
		}
	}
}
