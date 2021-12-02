package timer_Ex;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;


//TimerTask + ctrl + space 
class Task1 extends TimerTask{
	private int i = 0;
	@Override
	public void run() {
		i += 5;
		System.out.println("계란 삶는 중 " + i + "초");
	}
}
class Task2 implements Runnable{
	// Runnable의 추상메소드를 구현(완성)한다.
	@Override
	public void run() {
		// 할일의 코드를 적는다
		//JO + ctrl + space / show + ctrl + space
		JOptionPane.showMessageDialog(null, "계란 삶기 완료");		
	}
}

public class App {

	public static void main(String[] args) {
		// 1. 5초간격타이머 "계란 삶는 중"
		// 2. 30초 간격 타이머 "계란 삶기 완료"
		
		//timer + ctrl + space
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task1(), 5000L, 5000L);
		//scheduleAtFixedRate 제일 밑에꺼
		//Executors + ctrl + space / newSchedul + ctrl + space
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task2(), 30L, 30L, TimeUnit.SECONDS);

	}
}
