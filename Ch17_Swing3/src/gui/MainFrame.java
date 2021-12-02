package gui;

import java.awt.BorderLayout;
//import java.awt.Color;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	// worning에서 defalt serial version ID 생성
		private static final long serialVersionUID = 1L;

	//MainFrame은 JFrame을 상속받았기 때문에 JFrame 사용 가능
	public MainFrame(String title) {
		super(title); //창의 이름을 넣어서 생성
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); 
		
		// 패널 넣기
		// 패널 넣기 전에 레이아웃 설정
		// 창에 컴포넌트를 붙이기 위한 레이아웃 설정
		setLayout(new BorderLayout());
		//저장하면 import BorderLayout생성됨
		
		//주소를 알기위해 아래와 같이 수정
		final MainPanel mainPanel = new MainPanel();
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);


	}
}
