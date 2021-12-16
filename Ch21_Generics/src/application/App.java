package application;

import collections.Wrapper;
import hierarchy.Cat;
import hierarchy.Creature;
import hierarchy.Mammal;

public class App {

	public static void main(String[] args) {
/*		// Wrapper+c+s : 
		Wrapper wrapper = new Wrapper();
		
		Cat cat = new Cat("삼색이");
		wrapper.set(cat);
		// wrapper.set(Object object);
		// 모든 클래스는 Object클래스를 상속받기 때문에 Cat클래스를 대신 넣을수 있다.
		// Object object = new Cat;
		// Object object = cat;
//		모든 클래스 입력 가능하다.
// 		Mammal mam = new Mammal("포유류");
//		Creature cr = new Creature("크리쳐");
//		wrapper.set(cr);
//		wrapper.set(mam);
//		
//		Cat c1 = wrapper.get();
//		리턴이 Object 타입이기 때문에 하위 타입 (Cat)으로 형변환 필요
		Cat c1 = (Cat)wrapper.get();
		
		System.out.println(c1);
		//형변환이 불편하니까 제네릭 타입 사용하기 -> Wrapper로 가랏!
*/		// 제네릭타입 
		Wrapper<Cat> wrap1 = new Wrapper<>();
		Wrapper<Creature> wrap2 = new Wrapper<>();
		Wrapper<Mammal> wrap3 = new Wrapper<>();
				
		Cat cat = new Cat("삼색이");
		Mammal mam = new Mammal("포유류");
		Creature cr = new Creature("생물");
		
		//wrapper.set()에는 모든 클래스를 입력 가능하다.
		wrap1.set(cat);
		wrap2.set(cr);
		wrap3.set(mam);
				
		Cat c1 = wrap1.get();
		Creature c2 = wrap2.get();
		Mammal m1 = wrap3.get();
				
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(m1);
	}

}
