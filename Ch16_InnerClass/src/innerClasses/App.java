package innerClasses;

public class App implements Runnable {	
	private String name = "미키마우스";

	public static void main(String[] args) {
		new App().start();
	}

	private void start() {
		// activate메소드를 사용하여 이너클래스들로 실행 방법
		// 1. App에 인터페이스 Runnable을 구현해서 실행
		activate(this);
		// 2. 익명클래스
		activate (new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
		// 3. 메소드 이너 클래스
		class Runner1 implements Runnable{
			public void run() {
				System.out.println(name);
			}
		}
		activate(new Runner1());
	}
	
	public void activate(Runnable runnable) {
		runnable.run();
	}
	// App implements Runnable로 수정후 오류 클릭
	@Override
	public void run() {
		System.out.println(name);
	}
}
