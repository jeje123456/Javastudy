package application;

public class IntArray {

	public static void main(String[] args) {
	// 배열은 같은 타입의 여러 변수를 하나로 묶은 자료형 (참조자료형)
		int[] numbers = {2,4,6,8}; 
		//정수 int형 배열 선언과 초기값 {2,4,6,8}
		/* 인덱스    값
		 *   0  : 첫번째 값
		 *   1  : 두번째 값
		 *   2  : 세번째 값
		 *   3  : 네번째 값
		 */ 
	//인덱스 값으로 배열의 실제 값을 가져오는 법 = 배열이름[인덱스번호]
		for (int i=0; i<4; i++) {
		System.out.printf("인덱스번호 %d의 값은 %d이다.\n", i, numbers[i]);
		}
	}

}
