package multiThread;

public class App {
	public static void main(String[] args) {
		// 멀티쓰레드
//		Runnable runnable = () -> {
//			for(int i=0; i<10; i++) {
//				System.out.println("i : " + i);
//			}
//		};
//		// Runnable의 추상메소드는 void run이기 때문에 리턴값없음
//		// runnable.run();
//		// Thread가 runnable을 실행
//		Thread t1 = new Thread(runnable);
//		Thread t2 = new Thread(runnable);
//		
//		t1.start();
//		t2.start();
//		
//		System.out.println("헬로우");
		
		// 너무 빠르게 진행되서 순서를 모르겠어서 Thread.sleep사용
		// Thread.sleep(500); : 0.5초대기 
		Runnable runnable = () -> {
			for(int i=0; i<10; i++) {
				System.out.println("i : " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		// thread는 매개변수를 실행시킨다.
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start();
		t2.start();
		
		System.out.println("헬로우"); // 메인스레드
		// 메인스레드가 제일 먼저 실행됨
	}
}
