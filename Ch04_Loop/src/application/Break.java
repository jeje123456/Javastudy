package application;

public class Break {

	public static void main(String[] args) {
		// 반복문 안에서 break 사용시 반복문을 빠져나옴
		int count = 0;
		while (true) { //무한반복
			System.out.println("헬로우!" + count);
			
			if (count == 5) {
				break; //조건식 만족시 반복문 종료
			}
			
			System.out.println("How are you?");
			count++;
		}
		System.out.println("종료.");
	}

}
