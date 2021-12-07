package application;

import javax.swing.SwingUtilities;

import gui.MainFrame;

public class App {

	public static void main(String[] args) {
		// 프로그램의 안정성을 위해서 권장하는 코드로
		// SwingUtilities.invokeLater( () -> {여기안에 코드 작성} );
		SwingUtilities.invokeLater(()-> {
			new MainFrame("테스트 스윙 앱");
		});
		
		
	}

}
