package multi_Inheritance;

public class Person implements Speaker, Greeter{
//	오류눌러서 add unimplemented methods 클릭
	//interface 구현하기
	@Override
	public void greet() {
		System.out.println("환영합니다");
		
	}

	@Override
	public void speak() {
		System.out.println("사람입니다");
		
	}

}
