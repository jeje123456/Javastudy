package application;

public class StringArray2 {

	public static void main(String[] args) {
		// 문자열(String)은 참조 자료형, 참조 변수는 주소값을 가진다.
		// 참조변수(reference variable)
		String text = null; //null은 주소값이 없다는 뜻.
		// int x = null; 기본 자료형에는 null 입력불가
		// int는 4byte로 정해져있지만, 문자열은 정해져있지않음.
		// 문자열은 실제 값을 만들었을때 그 주소를 저장함.
//		text = new String("Hello!"); 
		text = "헬로우!";
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		
		texts = new String[3];
		//배열 문자열 3칸을 실제 생성해서 texts에 주소 입력
		System.out.println(texts);
		System.out.println(texts[0]);
		
		texts[0] = new String("안녕!");
		texts[1] = "하이!";
		texts[2] = "굿바이!";
		
		for (String w : texts) {
			System.out.println(w);
		}
	}

}
