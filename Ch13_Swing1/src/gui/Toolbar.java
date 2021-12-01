package gui;

import javax.swing.JButton;
import javax.swing.JToolBar;
//JTool + ctrl + space
public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public Toolbar() {
		// 툴바에 버튼 붙이기
		add(new JButton("버튼1"));
		add(new JButton("버튼2"));
	}
}
