package anonymous_Class;

public class App {
	
	private String name = "펭수";

	public static void main(String[] args) {
		
		new App().start();
	
	}
	
	private void start() {
//		System.out.println(name);
		/*
		Runnable runner = new Runnable() {
			public void run() {
				System.out.println(name);
			}
		};
		
		//new+c+s
		Runnable runner2 = new Runnable() {
			
			public void run() {
				System.out.println("헬로우" + name);	
			}
		};
		*/
//		runner.run();
//		runner2.run();
		
//		activate(runner);
//		activate(runner2);
		
		// 매개변수로 인터페이스의 객체 입력일 경우 익명클래스를 이용하여 바로 작성 가능
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
		
	}
	
	public void activate(Runnable runnable) {
		runnable.run(); // 인터페이스의 추상메소드 실행
	}
	
	
	
}

