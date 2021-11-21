package application;

public class MultiArray {

	public static void main(String[] args) {
		// 이중배열 : 배열 안에 배열이 들어있음
		String[][] texts = {
				{"하나", "둘", "셋"},
				{"넷", "다섯", "여섯"},
				{"일곱", "여덟", "아홉"}
		};
		
		for (int i=0; i<texts.length; i++) {
			System.out.printf("%d번째 배열 :", i);
			String[] inArray = texts[i];
			
			for(int j=0; j<inArray.length; j++) {
				System.out.printf("[%d][%d]의 값 = %s   ", i, j, inArray[j]);
			}
			
			System.out.print("\n");
		}
	}

}
