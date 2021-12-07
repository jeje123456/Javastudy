package gui;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {
	// warning에서 default serial version ID 생성
	private static final long serialVersionUID = 1L;

	public Toolbar() {
		// 툴바에 버튼 붙이기
		add(new JButton("버튼1"));
		add(new JButton("버튼2"));
	}
}
