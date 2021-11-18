package application;

public class Printf {

	public static void main(String[] args) {
		// Printf 출력
		// Printf에서만 출력서식 사용 가능
		// %d=정수, %f=실수,%c=문자,%s=문자열,%n=줄바꿈=\n
		int age = 25;
		String addr = "부산진구";
		double pi = 3.14;
		
		System.out.printf("내 나이는 %d살 입니다.\n", age); // printf도 줄띄움이 없음
		System.out.printf("내 나이는 %d살이고 %s에 살고 있습니다.\n", age, addr);
		System.out.printf("파이의 값은 : %.2f", pi); // %.숫자f = 소수점을 숫자자리수까지만 보겠다
				

	}

}
