package application;

public class For {

	public static void main(String[] args) {
		// for 반복문 for(초기값;조검;증감){명령문;}
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("i : " + i);
//		}
//		
//		for(;;) { //아무런 값이 없을 때 = 무한반복
//			System.out.println("헬로우!");
//		}
		//예제. for 반복문을 사용하여 1에서 100까지의 합을 출력하라
		int total = 0;
		for (int i = 1; i<=100; i++) {
			total += i;
		}
		System.out.printf("1에서 100까지의 합 : %d", total);
	}

}
