package local_InnerClass;

public class App {
	private String name; //인스턴스변수
	
	public App(){
		name = "엘리자베스";
	}

	private void run() {
//		System.out.println(name);
		
		//클래스 안의 메소드에 클래스(= 이너클래스) 작성
		class Printer{
			public void print() {
				System.out.println(name);//내부클래스는 상위클래스의 변수를 사용가능하다.
			}
		}
		/*
		Printer p = new Printer();
		p.print(); */ //요약해서 아래(주소값은 알수없어짐)
		new Printer().print(); //실행문
	}
	
	
	public static void main(String[] args) {
		// 이너클래스 = 메소드 안에 있는 클래스
		
		// static메소드인 메인메소드에서는 인스턴스 변수 사용불가 -> 객체를 생성해야 사용가능
//		System.out.println(name);
		
		App app = new App();
		app.run();
//		app.name = "라이언";
//		app.run();
		
	}	
}
