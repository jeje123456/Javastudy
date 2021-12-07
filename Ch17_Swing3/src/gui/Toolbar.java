package gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JToolBar;

//컬러변경클래스를 하나로 만들기
//class ColorButtonListener implements ActionListener{
//	private MainPanel mainPanel;
//	private Color c;
//	
//	// ctrl + space + BlueButtonListener()클릭
//	public ColorButtonListener(MainPanel mainPanel, Color c) {
//		this.mainPanel = mainPanel;
//		this.c = c;
//	}
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		mainPanel.setBackground(c);
//	}
//}

//JTool + ctrl + space
public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;
	// 	매개변수 MainPanel mainPanel
	public Toolbar(MainPanel mainPanel) {
		// 버튼을 만들어서 붙이기
		// JB + ctrl + space / red + ctrl + space
		final JButton redButton = new JButton("RED");
		final JButton blueButton = new JButton("BLUE");

		//람다식으로 변경
		redButton.addActionListener(e -> mainPanel.setBackground(Color.RED));	
		blueButton.addActionListener(e -> mainPanel.setBackground(Color.BLUE));
		
		// 툴바에 버튼 붙이기
		add(redButton);
		add(blueButton);
	}
}
