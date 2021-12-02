package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JToolBar;
/*
class RedButtonListener implements ActionListener{
	private MainPanel mainPanel;
	
	// ctrl + space + RedButtonListener()클릭
	public RedButtonListener(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("빨간색 버튼 클릭");
//		색변경
		mainPanel.setBackground(Color.RED);
	}
}

class BlueButtonListener implements ActionListener{
	private MainPanel mainPanel;
	
	// ctrl + space + BlueButtonListener()클릭
	public BlueButtonListener(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("파란색 버튼 클릭");
		mainPanel.setBackground(Color.BLUE);
	}
}
*/
//컬러변경클래스를 하나로 만들기
class ColorButtonListener implements ActionListener{
	private MainPanel mainPanel;
	private Color c;
	
	// ctrl + space + BlueButtonListener()클릭
	public ColorButtonListener(MainPanel mainPanel, Color c) {
		this.mainPanel = mainPanel;
		this.c = c;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		mainPanel.setBackground(c);
	}
}

//JTool + ctrl + space
public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;
	// 	매개변수 MainPanel mainPanel
	public Toolbar(MainPanel mainPanel) {
		// 버튼을 만들어서 붙이기
		// JB + ctrl + space / red + ctrl + space
		final JButton redButton = new JButton("RED");
		final JButton blueButton = new JButton("BLUE");
		
		//버튼에 이벤트를 연결 ('클릭' 이벤트)
		//addAc + ctrl + space = 이벤트를 연결하는 액션리스너(메소드)
		//리스너에 매개변수로 mainPanel
		/*
		redButton.addActionListener(new RedButtonListener(mainPanel));
		blueButton.addActionListener(new BlueButtonListener(mainPanel));
		*/
		
		//컬러변경클래스를 하나로 만들기
		redButton.addActionListener(new ColorButtonListener(mainPanel, Color.RED));
		blueButton.addActionListener(new ColorButtonListener(mainPanel, Color.BLUE));
		
		// 툴바에 버튼 붙이기
		add(redButton);
		add(blueButton);
	}
}
