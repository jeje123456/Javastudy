package application;

import java.util.Scanner;

public class NewArray {

	public static void main(String[] args) {
		// new키워드로 배열을 생성한다
	// int[]n = {1,2,3}; 초기값을 바로 넣는 방법을 리터럴이라고 한다.
		int[] numbers ; // 정수형 배열 numbers 선언
		numbers = new int[3]; // 실제 정수형 3개의 배열을 만듬
		int total = 0;
//		배열 값 입력하기.		
//		numbers[0] =5;
//		numbers[1] =2;
//		numbers[2] =4;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<numbers.length; i++) {
			System.out.printf("정수형 배열[%d] 값을 입력하세요\n",i);
			numbers[i] = scanner.nextInt();
			total += numbers[i];
		}
		
		for(int i=0;i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
			total += numbers[i];
		}
		System.out.println("총 합은 : " + total);
	}

}
