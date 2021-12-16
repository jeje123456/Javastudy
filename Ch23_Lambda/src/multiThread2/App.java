package multiThread2;

public class App {
	
	private int value = 0;
	
	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for(int i=0; i<100000; i++) {
				value++; //value를 1씩 증가 1000번실행하면 value=1000이됨
			}
		};
		
		Thread t1 = new Thread(runnable); // 새로운 스레드1 생성
		Thread t2 = new Thread(runnable); // 새로운 스레드2 생성
		// t1과 t2는 for문을 실행
		// t1과 t2가 동시에 실행되었을때 value 값에 오차가 생김
		t1.start(); // t1실행
		t2.start(); // t2실행
		
//		System.out.println("Value : " + value); // 메인쓰레드 실행
		
		// join() 하면 오류발생 -> throw
		// join은 해당 쓰레드가 실행이 끝날때까지 run()의 다음 코드 실행을 대기시킨다.
		// 컴퓨터 성능에 따라서 t1.join이 실행되기 전에 t2.start가 작동해버리면 오차발생
		t1.join(); // 메인쓰레드가 t1을 실행할때까지 대기
		t2.join(); // 메인쓰레드가 t2를 실행할때까지 대기
		
		System.out.println("Value : " + value); // t1,t2가 끝난 뒤에 출력
	}
	
	public static void main(String[] args) throws InterruptedException {
		// 멀티 쓰레드
		new App().run(); // 앱의 객체 만들고 run메소드 실행
		// 오류발생 -> throw
		// i<100 -> 200
		// i<1000 -> 2000
		// i<1000000 -> value 1991879
	}
}
