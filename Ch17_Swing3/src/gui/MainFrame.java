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
		
		//JPanel + ctrl + Enter
/*		JPanel panel = new JPanel(); //패널을 생성
		panel.setBackground(Color.green);// 패널 배경색 설정
		//add로 패널 붙이기
		add(panel, BorderLayout.CENTER);// 위에서 만든 패널의 레이아웃의 가운데 붙이기
		//패널은 가운데에 붙여졌는데 위아래에 아무것도 없어서 자동으로 커짐  
		 */
		// 메인프레임에 메인패널 주소없이 바로 넣음
/*		add(new Toolbar(), BorderLayout.NORTH);
		add(new MainPanel(), BorderLayout.CENTER); */
		
		//주소를 알기위해 아래와 같이 수정
		final MainPanel mainPanel = new MainPanel();
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);
//		mainPanel.setBackground(Color.CYAN); // 색 바뀌는지 확인
//		블로그에 레퍼런스 변수 읽어보기
//		Toolbar 매개변수로 mainPanel 주고 ctrl + Toolbar클릭 = Toolbar로 이동

	}
}
