package lambda_return;

interface Joiner{
	// 리턴값이 있는 인터페이스
	String join(String text1, String text2);
}

public class App {
	public static void main(String[] args) {
		// 인터페이스에 리턴값이 있는 경우
		// 리턴값이 있으니 여러줄 입력해야되서 코드블록 필요
		// 코드블록 안에 return 필수
		Joiner joiner = (t1, t2) -> {
			String text = t1 + " - " + t2;
			return text;
		};		

		System.out.println(joiner.join("치킨", "맥주"));
		System.out.println(joiner.join("학원", "공부"));
		
//		Joiner joiner2 = (s1, s2) -> {return s1 + " + " + s2;};
		// 한줄일때 중괄호{ } 생략 가능
//		Joiner joiner2 = (s1, s2) -> return s1 + " + " + s2;
		// 괄호 없을 때 return 생략 가능
		Joiner joiner2 = (s1, s2) -> s1 + " + " + s2;
		System.out.println(joiner2.join("치킨", "맥주"));
		System.out.println(joiner2.join("학원", "공부"));
		
	}
}
