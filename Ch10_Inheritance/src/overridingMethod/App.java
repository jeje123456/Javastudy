package overridingMethod;

public class App {

	public static void main(String[] args) {
		// 메소드 오버라이딩
		Cat cat1 = new Cat();
		cat1.vocal();
		
		HouseCat cat2 = new HouseCat();
		cat2.vocal();
		cat2.hunt();
		
		WildCat cat3 = new WildCat();
		cat3.vocal();
		cat3.hunt();
		
		Tiger cat4 = new Tiger();
		cat4.vocal();
		cat4.hunt();
	}

}
