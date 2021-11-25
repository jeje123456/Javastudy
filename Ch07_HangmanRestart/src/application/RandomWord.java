package application;

import java.util.Random;

public class RandomWord {
	// 스페이스바로 띄워진 단어들을 문자열로 str에 저장
	private String str = "contractprocedure initiative competition suggestion instanceinstruction opportunity restaurant medicineboyfriend footballemployernegotiation personality significance engineering bathroommanufacturer proposalconstruction assistant agreement contribution requirement satisfaction reception preference solutioncigarette information improvement databasedisasterstrangerefficiency investment platformknowledge assumption government operation appearance argumentrevolution presencesympathydeliveryequipment candidate";
	// 문자열을 스페이스바를 기준으로 잘라서 배열로 입력
	private String[] words = str.split(" ");

	private String selectWord; // 랜덤으로 선택된 단어
	private char[] characters;// 문자 배열
	
	private Random random = new Random();
	public RandomWord() {
		selectWord = words[random.nextInt(words.length)];
		characters = new char[selectWord.length()] ;
	}
	// RandomWord 선택된 단어 selectWord를 Hangman 클래스에서 출력함
	public String toString() {
		// 문자는 ''에 값을 입력
		// null문자 유니코드= \u0000
		StringBuilder sd = new StringBuilder();
		for(char c : characters) {
			if(c == '\u0000') {
				sd.append('_');
			}
			else {
				sd.append(c);
			}
			sd.append(' ');
		}
		return sd.toString();
	}
//넘어온 문자를 검사해서 랜덤으로 선택한 단어에 c 문자가 있으면
//그 문자를 characters 배열의 인덱스 위치에 저장	
	public boolean addGuess(char c) {
		for(int i=0; i <selectWord.length(); i++) {
			if (c == selectWord.charAt(i)) {
				characters[i] = c;
				return true;
			}
		}
		return false; // 맞는 문자가 없음
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

//	//현재 words 배열에 있는 전체 단어를 Test에서 출력
//	public void getWords() {
//		for(String w : words) {
//			System.out.println(w);
//		}
//	}	
}

