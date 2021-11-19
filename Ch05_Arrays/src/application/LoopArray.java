package application;

import java.util.Scanner;

public class LoopArray {

	public static void main(String[] args) {
		// 문자열 타입으로 만든 배열
		String[] animals = {"개", "고양이", "늑대", "호랑이", "삵" };
		
		// 배열.length는 배열의 사이즈(크기)를 알려준다.
		for (int i=0; i<animals.length; i++) {
			System.out.printf("인덱스번호 %d의 값은 %s이다.\n", i, animals[i]);
		}
	}

}