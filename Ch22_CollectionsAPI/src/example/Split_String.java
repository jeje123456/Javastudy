package example;

public class Split_String {

	public static void main(String[] args) {
		// split() 문자열을 쪼개서 배열로 리턴 
		// (., /, (), space 등 특수문자 모두 제외하고 오직 단어만)
		String text1 = "(CNN)On Wednesday, Pfizer and BioNTech announced that preliminary lab studies show a third dose of the Pfizer/BioNTech vaccine can improve protection against Omicron.";
		String text2 = "신종 코로나바이러스 감염증(코로나19) 백신 제조 제약사 아스트라제네카의 코로나19 항체 복합체 '이부실드'가 미국 FDA(식품의약국)로부터 코로나19 노출 전 예방용도로 긴급사용 승인을 받았다.";
		
		String[] words1 = text1.split("[^a-zA-Z]+"); // 정규표현식
		// ^ = 제외한다. a-zA-Z = a에서z까지 소문자 대문자 말고 다른것들을 . + = 여러개일때
//		String[] words = text1.split(text1)); // 영문 철자를 제외한 특수문자 제외
		// 괄호안에 " "를 넣으면 space bar기준으로 나눔(특수기호 제외 안됨)
		//String regex = 레귤러익스프레션
		
		for(String w1 : words1) {
			if(w1.length() < 3) { // 철자가 3개 미만이면 제외하겠다.
				continue; 
			}
			System.out.println(w1.toLowerCase()); 
			//toLowerCase() : 소문자로 변환해서 출력
		}
		
		String[] words2 = text2.split("[^가-힣]+");
		for(String w2 : words2) {
			if(w2.length() < 3) { // 철자가 3개 미만이면 제외하겠다.
				continue; 
			}
			System.out.println(w2); 
		}
		
	}

}
