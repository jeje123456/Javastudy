package multiThread3;

public class App {
	
	private int value = 0;
	
	// synchronized -> 이 메소드는 한번에 하나의 쓰레드에만 접근이 가능하다
	private synchronized void increment() {
		value++;
	}
	
	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for(int i=0; i<100; i++) {
				increment(); // 메소드로 value값 증가
			}
		};
		
		Thread t1 = new Thread(runnable); // 새로운 스레드1 생성
		Thread t2 = new Thread(runnable); // 새로운 스레드2 생성
		Thread t3 = new Thread(runnable); // 새로운 스레드3 생성
		
		t1.start(); // t1실행
		t2.start(); // t2실행
		t3.start(); // t2실행
		
		// join() 하면 오류발생 -> throw
		t1.join(); // 메인쓰레드가 t1을 실행할때까지 대기하고 다음 코드 실행
		t2.join(); // 메인쓰레드가 t2를 실행할때까지 대기하고 다음 코드 실행
		t3.join(); // 메인쓰레드가 t3를 실행할때까지 대기하고 내용을 출력
		
		System.out.println("Value : " + value); // t1,t2가 끝난 뒤에 출력
	}
	
	public static void main(String[] args) throws InterruptedException {
		new App().run(); // 앱의 객체 만들고 run메소드 실행
	}
}
