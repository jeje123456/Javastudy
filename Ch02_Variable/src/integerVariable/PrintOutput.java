package integerVariable;

public class PrintOutput {

	public static void main(String[] args) {
		// 문자열 + 숫자 = 문자열
		int x = 5;
		int y = 7;
		int z = x + y;
		
		System.out.println("x + y 의 값은 : " + z);
		
		String s = "x + y의 값은 : " + z;
		
		System.out.println(s);
		
		double a = 3.14;
		double b = 2.16;
		// int k = a + b; // error발생(타입오류)
		// 맞지 않는 타입을 입력할 수 없다.
		double c = a + b;
		System.out.println(c);
		
	}

}
