package application;

public class App {

	public static void main(String[] args) {
		// 행맨게임 시작
		Hangman game = new Hangman();
		game.run();
		game.close();
	}

}
