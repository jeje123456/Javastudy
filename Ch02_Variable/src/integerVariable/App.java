package integerVariable;

public class App {

	public static void main(String[] args) {
		// ctrl + shift + f = 정렬
		//변수만들기 : 1. 변수선언(타입,자료형), 2. 변수 초기화
		int x = 10;
		int y = 30;
		
		int z = x + y;
		
		int a; //변수 a를 선언(타입필요)
		int b = 10; //변수 b는 선언과 동시에 초기화
		a = 7; //a에 초기값 입력

		System.out.println("변수z의 값은 : " + z); //문자열("") + 정수 = 문자열
		System.out.println("변수a의 값은 : " + a);
		System.out.println("변수b의 값은 : " + b);
		// 변수는 값을 재할당 할 수 있다.(바꿀 수 있다.)
		z = a + b;
		
		System.out.println("재할당된 변수z의 값은 : " + z);
		
	}

}
