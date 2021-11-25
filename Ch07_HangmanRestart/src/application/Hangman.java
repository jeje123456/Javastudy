package application;

import java.util.Scanner;

public class Hangman {
	private boolean running = true;
	//private boolean running = false;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	
	private int remainTries = 20;
	private char lastGuess;
	
	/** 
	 * 프로그램을 실행하는 run메소드
	 */
	public void run() { // 프로그램 시작 => 반복
		do {
			dispalayWord(); // 화면에 단어표시
			getUserInput(); // 철자 하나를 입력받음 (scanner)
			checkUserInput(); // 맞는지 체크(전부 맞으면 running = false)
		} while (running); // running이 false가 되면 반복종료
	}
	
	private void dispalayWord() {
//		System.out.println("화면에 단어 표시");
		System.out.println(word.toString());
	}
	
	private void getUserInput() {
		System.out.println("철자 하나를 입력 : ");
		String guess = scanner.nextLine();
		lastGuess = guess.charAt(0);
		// guess.charAt(0) : 입력받는 첫번째 문자
		}
	
	private void checkUserInput() {
		boolean isCorrect = word.addGuess(lastGuess);
		if(isCorrect) {
			if(word.isCompleted()) {
				System.out.println("잘 맞췄어요!");
				System.out.println("정답은 : " + word);
				System.out.println("남은 시도횟수 : " + remainTries);			
				running = false; //반복문 빠져나옴 = 종료
			}
		}
		else {
			System.out.println("틀렸습니다.");
			if (remainTries == 0) {
				System.out.println("Game Over!");
				running = false;
			}
		}
	}
	/** 
	 * 스캐너를 닫는 메소드
	 */
	public void close() {
		scanner.close();
	}

		
}
