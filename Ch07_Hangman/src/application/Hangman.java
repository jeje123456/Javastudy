package application;

import java.util.Scanner;

public class Hangman {
	private boolean running = true; // 무한반복됨
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);

	/** 
	 * 프로그램을 실행하는 run메소드
	 */
	public void run() { // 프로그램 시작 => 반복
		do {
			dispalayWord(); // 화면에 단어표시
			getUserInput(); // 철자 하나를 입력받음 (scanner)
			checkUserInput(); // 맞는지 체크(전부 맞으면 running = false)
		} while (running); // runing이 false가 되면 반복종료
	}

	private void dispalayWord() {
		// System.out.println("화면에 단어 표시");
		// 랜덤 워드 객체를 생성해 랜덤으로 한 단어를 출력한다.
		System.out.println(word.toString());
	}

	private void getUserInput() {
		// System.out.println("철자 하나를 입력");
		// 유저에게 한 문자 입력 요구
		// 입력받은 문자열에서 한 문자를 뽑야서
		// RandomWord 객체에 전달(addGuess(문자) 메소드를 만들자)
		System.out.print("한 문자 입력 : ");
		
		String guess = scanner.nextLine();
		// 단어에서 입력받은 문자가 있는지 확인해서 처리한다.
		// (단어는 RandomWord 객체 word를 사용)
		// guess.charAt(0) : 입력받는 첫번째 문자
		word.addGuess(guess.charAt(0));
	}

	private void checkUserInput() {
		// System.out.println("맞는지 체크"); 
		//유저가 단어를 다 맞췄는지 체크해서 게임을 종료
		//게임 종료확인을 하는 메소드 isCopleted 를 RandomWord 클래스에 만들기
		if(word.isCompleted()) {
			System.out.println("잘 맞췄어요!");
			System.out.println("정답은 : " + word.toString());
			running = false; //반복문 빠져나옴 = 종료
		}
	}
	
	/** 
	 * 스캐너를 닫는 메소드
	 */
	public void close() {
		scanner.close();
	}

}
