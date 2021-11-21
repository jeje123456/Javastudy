package application;

public class StringArray {

	public static void main(String[] args) {
		// 문자열 타입으로 만든 배열
		String[] animals = {"개", "고양이", "늑대", "호랑이" };
		
		for (int i=0; i<4; i++) {
			System.out.printf("인덱스번호 %d의 값은 %s이다.\n", i, animals[i]);
		}
		
		animals[0] = "삵";
		
		for (int i=0; i<4; i++) {
			System.out.printf("인덱스번호 %d의 값은 %s이다.\n", i, animals[i]);
		}
	}

}
