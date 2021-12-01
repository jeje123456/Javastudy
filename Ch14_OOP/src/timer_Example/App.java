package timer_Example;

import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask{
	@Override
	public void run() {
		System.out.println("헬로우");
	}
}

public class App {

	public static void main(String[] args) {
		//타이머를 사용하는 방법
		
		//timer + ctrl + space
		Timer timer = new Timer();	
		//scheduleAtFixedRate 제일 밑에꺼
		timer.scheduleAtFixedRate(new Task(), 0L, 1000L);
		//javadoc에 설명
		//TimerTask + ctrl + click : 설명
		//TimerTask자리에 객체
		//long period에 을 넣으면 1초에 한번씩 반복
		//1000L(long이라서 L입력) 안적어도 자동변환됨

	}

}
