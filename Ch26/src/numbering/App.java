package numbering;

public class App {

	public static void main(String[] args) {
		/*
		 * 0 - 9 decimal		10진수
		 * 0 - 1 binary			2진수 (컴퓨터)
		 * o - F hexadecimal	16진수
		 * 
		 * 6213
		 * 
		 * 0, 1, 10, 11, 100, 101, 110, 111, 1000
		 * 
		 * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F, 10, 11...
		 */
		
		// 16진수를 리터럴(값을) 표시할때 0x를 먼저 붙인다.
		// 이진수를 리터럴(값을) 표시할때 0b를 먼저 붙인다.
		int val = 123;
		System.out.println("10진수 : " + val);
		System.out.println(" 2진수 : " + Integer.toBinaryString(val));
		// 정수클래스에서 toBinaryString(정수값) : 10진수 정수를 2진수로 표현
		System.out.println("16진수 : " + Integer.toHexString(val));
		// 정수클래스에서 toHexString(정수값) : 10진수 정수를 16진수로 표현
		System.out.println();
		
		int value255 = 0xFF;
		System.out.println("10진수 : " + value255);
		System.out.println(" 2진수 : " + Integer.toBinaryString(value255));
		System.out.println("16진수 : " + Integer.toHexString(value255));
		System.out.println();
		
		int value15 = 0b1111;
		System.out.println("10진수 : " + value15);
		System.out.println(" 2진수 : " + Integer.toBinaryString(value15));
		System.out.println("16진수 : " + Integer.toHexString(value15));
		
		// 이진수가 ob1111이면 16진수는 f
// 1byte로 표현할 수 있는 가장 큰수가 2진수로는 1이 8개, 16진수로 ff, 10진수로 255이다.
// 정수형 byte는 1byte이고 음수와 양수를 표현하려고 하다보니 -128~127까지다.(255개)
// int는 4byte
	}

}
