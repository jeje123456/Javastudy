package example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	
	public static void greet() { // 스테틱메소드는 객체 생성 없이 사용가능
		System.out.println("헬로우");
	}

	public static void main(String[] args) {
		// 메소드 레퍼런스
		// 타이머 만들기
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
//		service.scheduleAtFixedRate(null, 0, 0, null);
//		service.scheduleAtFixedRate(new Runnable, 0, 1000, TimeUnit.MILLISECONDS);
		// Runnable 인터페이스의 run()메소드는 매개변수도 없고 리턴도 없다.
		// 람다식
//		service.scheduleAtFixedRate(() -> {}, 0, 0, TimeUnit.MILLISECONDS);
//		service.scheduleAtFixedRate(() -> System.out.println("헬로우"), 0, 0, TimeUnit.MILLISECONDS);
								  //클래스명::메소드명
		service.scheduleAtFixedRate( App::greet, 0, 1000, TimeUnit.MILLISECONDS);
	}
}
