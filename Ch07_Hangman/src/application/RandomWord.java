package application;

import java.util.Random;

public class RandomWord {
	// 랜덤문자생성 사이트 : random word generator 검색
	// 공백 없애기 사이트
	// 스페이스바로 띄워진 단어들을 문자열로 str에 저장
	private String str = "contractprocedure initiative competition suggestion instanceinstruction opportunity restaurant medicineboyfriend footballemployernegotiation personality significance engineering bathroommanufacturer proposalconstruction assistant agreement contribution requirement satisfaction reception preference solutioncigarette information improvement databasedisasterstrangerefficiency investment platformknowledge assumption government operation appearance argumentrevolution presencesympathydeliveryequipment candidate";
	
	// 문자열을 스페이스바를 기준으로 잘라서 배열로 입력
	private String[] words = str.split(" ");
	
	private String selectWord; // 랜덤으로 선택된 단어
	private char[] characters; // 문자 배열
	
	// 생성자에 랜덤 단어를 선택
	// Random에서 ctrl+space -> Random-java.until 선택
	private Random random = new Random();

	public RandomWord() {
		// selectWord = words[0]; //나중에 랭덤으로 수정
		// 메소드 random.nextInt(숫자) = 숫자까지 랜덤으로 입력된다.
		// nextInt : 괄호안의 단어의 길이만큼 = 0~(배열갯수-1)만큼 랜덤으로 출력		
		//int randomIndex = random.nextInt(words.length);
		//selectWord = words[randomIndex];
		// 위 두줄을 아래로 요약
		selectWord = words[random.nextInt(words.length)];
		//System.out.println(selectWord);
		// System.out.println(toString());
		characters = new char[selectWord.length()];
	}
	
//	//현재 words 배열에 있는 전체 단어를 Test에서 출력
//	public void getWords() {
//		for(String w : words) {
//			System.out.println(w);
//		}
//	}
	
	public String toString() {
		// 단어를 _로 출력한다.
		// return selectWorld; //테스트용
		// String text = ""; //테스트용
		
		StringBuilder sb = new StringBuilder();
		//characters[3] = 'x'; //테스트용
		for(char c : characters) {
			sb.append(c == '\u0000' ? '_' : c);
			sb.append(' '); // 철자를 한칸씩 띄움
			// 문자는 ''에 값 입력 // 문자의 null문자 = \u0000
//			if(c=='\u0000') { // 문자의 초기값이면 아직 맞추지 못한 문자
//				sb.append('_');
//			}
//			else {
//				sb.append(c); // 문자를 맞췃을 경우
//			}
			// if else문을 삼항조건연산자로 수정
		}
		
		// System.out.println(selectWord); //정답출력(테스트용)
		return sb.toString(); // 선택된 랜덤 단어를 가져옴
		// return text; //테스트용
	}
	
//넘어온 문자를 검사해서 선택 단어에 있으면 characters 배열에 저장
	public void addGuess(char c) {
		for(int i= 0; i < selectWord.length(); i++) { //단어 길이만큼 반복
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
	}
	
	public boolean isCompleted() {
		// 철자를 다 맞췄는지 체크해서 true or false로 리턴
		for(char c : characters) { // 단어 전체 철자 반복 검사
			if(c == '\u0000') {
				return false; // 아직 맞춰야할 문자가 있음
			}
		}
		return true; // 다 맞췄음
	}
}
