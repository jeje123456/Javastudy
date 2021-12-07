package local_InnerClass;

public class App {
	private String name; //인스턴스변수로 객체를 생성해야 사용 가능
	
	// 객체를 생성하기 위해서 App 생성자 생성
	public App(){
		name = "엘리자베스";
	}
	
	public static void main(String[] args) {
		// 이너클래스 = 메소드 안에 있는 클래스

//		System.out.println(name);	
		// static메소드인 메인메소드에서는 인스턴스 변수 사용불가 -> 객체를 생성해야 사용가능
		
/*		static메소드는 객체가 만들어지기전에 존재하므로 static멤버(static변수)는 사용 가능하지만 인스턴스변수는 사용이 불가능하다. 
		반대로 인스턴스 메소드는 static 멤버들을 사용할 수 있다.  */

		
		App app = new App();
		app.run();
//		app.name = "라이언";
//		app.run();
	}	
	
	//run 메소드로 name 출력하기
	private void run() {
//		System.out.println(name);
		
		//클래스 안의 메소드에 클래스(= 이너클래스) 작성
		class Printer{
			public void print() {
				System.out.println(name);//내부클래스는 상위클래스의 변수를 사용가능하다.
				System.out.println(App.this.name);//사용가능
				
			}
		}
		/*
		Printer p = new Printer();
		p.print(); */ //요약해서 아래(주소값은 알수없어짐)
		new Printer().print(); //실행문
	}
}
