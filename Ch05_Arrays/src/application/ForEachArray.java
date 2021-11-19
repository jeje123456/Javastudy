package application;

import java.util.Scanner;

public class ForEachArray {

	public static void main(String[] args) {
		// for each 반복문
		// 간단한 배열의 반복에는 for each문을 사용
		// 인덱스 번호가 필요한 경우에는 for문을 사용
		String[] fruits = {"사과", "바나나", "복숭아"};
		int[] n = {1,2,3};
		boolean [] b = {true, false, true};
		double[] d = {1.1, 2.1, 3.1};
		//for each문은 (변수 : 배열){}
		//배열의 값이 1번씩 변수에 입력되어 반복
		for (String x : fruits) {
			System.out.print(x + " ");
		}
		System.out.print("\n");
		for (int x : n) {
			System.out.print(x + " ");
		}
		System.out.print("\n");
		for (boolean x : b) {
			System.out.print(x + " ");
		}
		System.out.print("\n");
		for (double x : d) {
			System.out.print(x + " ");
		}
	}

}
