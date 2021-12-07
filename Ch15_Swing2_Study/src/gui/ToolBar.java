package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;
/*
class RedButtonListener implements ActionListener{
	private MainPanel mainpanel; // 변수생성
	// 이벤트 추가
	@Override
	public void actionPerformed(ActionEvent e) {
		mainpanel.setBackground(Color.red);
	}
	
	public RedButtonListener(MainPanel mainpanel) {
		this.mainpanel = mainpanel;
	}
}

class BlueButtonListener implements ActionListener{
	private MainPanel mainpanel; // 변수생성
	@Override
	public void actionPerformed(ActionEvent e) {
		mainpanel.setBackground(Color.blue);
	}
	
	public BlueButtonListener(MainPanel mainpanel) {
		this.mainpanel = mainpanel;
	}
}
*/
/*
class ColorButtonListener implements ActionListener{
	private MainPanel mainpanel; // 변수생성
	private Color c;
	@Override
	public void actionPerformed(ActionEvent e) {
		mainpanel.setBackground(c);
	}
	
	public ColorButtonListener(MainPanel mainpanel, Color c) {
		this.mainpanel = mainpanel;
		this.c = c;
	}
}
*/
public class ToolBar extends JToolBar{

	private static final long serialVersionUID = 1L;
	
	//MainPanel의 주소값 mainpanel을 매개변수로 받도록 입력
	public ToolBar(MainPanel mainpanel) { // 추상클래스 JToolBar의 생성자를 오버로딩하는 ToolBar 생성자 만들기
		final JButton RedButton = new JButton("red");
		final JButton BlueButton = new JButton("blue");
		
		//ToolBar에 버튼 붙이기
		add(RedButton);
		add(BlueButton);
/*		
		// 이벤트를 연결하는 메소드 작성 
		// 버튼을 클릭하는 이벤트 Listener 매개변수로 mainpanel입력 
		RedButton.addActionListener(new ColorButtonListener(mainpanel, Color.RED));
		BlueButton.addActionListener(new ColorButtonListener(mainpanel, Color.BLUE));
*/		
		// 이너클래스를 사용하여 ColorButtonListener클래스를 없이 실행
		RedButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainpanel.setBackground(Color.red);
			}
		});
		BlueButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainpanel.setBackground(Color.blue);
			}
		});	
	
	}
}
