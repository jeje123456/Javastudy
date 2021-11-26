package application;

import game.Game;

public class App {

	public static void main(String[] args) {
		// (main이니까)여기서부터 프로그램 시작
// 클래스 불러오기 : ctrl + space (or) Ctrl + shift + o (여러개 한꺼번에)
//		Game game = new Game();
//		game.run();
//참조변수가 필요없으므로 아래처럼 할 수 있다. run이 실행은 되지만 주소가 어디인지는 모름
		new Game().run();
	}

}
