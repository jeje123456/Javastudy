package application;

public class App {
 //static은 바로 메모리에 올라가서 객체 생성없이 사용이 가능하다.
	public static void main(String[] args) {
		// 스테틱 변수는 클래스명.변수로 객체를 생성할 필요없이 바로 사용
		// Static = 상수 = 클래스 변수 (인스턴스변수 X)
		System.out.println(Cat.FOOD);
		//System.out.println(Math.); 하면 엄청 뭐가 많이 뜸
		System.out.println(Math.PI);
		
		System.out.println(Cat.count);
		//System.out.println(Cat.name); // 객체 생성해야 사용가능
		
		Cat cat1 = new Cat("마틸다");
		System.out.println(cat1.getCount());
		
		Cat cat2 = new Cat("삼색이");
		System.out.println(cat2.getCount());
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		Cat cat3 = new Cat("도도");
	
		System.out.println(Cat.getCount());
		System.out.println(cat3.toString());

		
	}

}
