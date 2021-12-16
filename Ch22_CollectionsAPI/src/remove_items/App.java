package remove_items;

import java.util.ArrayList;
import java.util.List;

class Cat {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}
public class App {

	public static void main(String[] args) {
		Cat c1 = new Cat("뚱땅이");
		
		List<Cat> cats = new ArrayList<>();
		cats.add(c1);
		cats.add(new Cat("삼색이"));
		cats.add(new Cat("마릴린"));
		cats.add(new Cat("도도"));
		
		// remove 메소드 2개 
		// : 1.인덱스번호 입력해서 삭제 2.객체주소 입력해서 삭제
		cats.remove(1); // 삼색이
		cats.remove(c1); // 뚱땅이 삭제
		
		cats.forEach(System.out::println);

	}

}
