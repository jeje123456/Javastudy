package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public MainFrame(String title) { // 추상클래스 JFrame의 생성자를 오버로딩하는 MainFrame 생성자 만들기
		super(title); // 슈퍼클래스의 생성자 호출, 창의 이름을 입력해서 생성
		
		setVisible(true); // 창을 보이게 함
		setSize(600,400); // 가로세로 길이 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 종료시 프로그램 종료	
	
		final MainPanel mainpanel = new MainPanel(); // 변하지 않는 MainPanel의 주소값 생성
		add(mainpanel, BorderLayout.CENTER); // 프레임에 패널 붙이기
		add(new ToolBar(mainpanel), BorderLayout.SOUTH); // 프레임에 툴바추가
//		mainpanel.setBackground(Color.black);
//		툴바의 매개변수로 mainpanel 입력
	}
}
