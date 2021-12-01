package polymorphism;

public class App {

	public static void main(String[] args) {
		// 다형성 : 자식 클래스 타입을 부모타입으로 형 변환
//		Cat cat1 = new Cat();
//		//HouseCat -> Cat으로 바꿔도 오류 없이 작동
//		Cat cat2 = new HouseCat();	
//		Cat cat3 = new WildCat();		
//		Cat cat4 = new Tiger();
//		
//		Cat[] cats = {cat1, cat2, cat3, cat4};
//		
		//cats배열의 각각의 객체를 c에 대입하여 반복
//		for(Cat c : cats) {
//			c.vocal();
//			c.hunt();
//		}
		
		//간단하게 만들기
		Cat[] cats = {new HouseCat(), new WildCat(), new Tiger()};
//		cats[0] == new HouseCat();
//		cats[1] == new WildCat();
//		cats[2] == new Tiger();
		
//		String[] s = {new String("문자열1"), new String("문자열2"), new String("문자열3")};
		
		//for반복문
		for (int i =0; i<cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		System.out.println("-----------");
		
		//foreach 반복문
		for (Cat c : cats) {
			c.vocal();
			c.hunt();
		}
		System.out.println("-----------");
		// 캐스팅 형변환(기본데이터 타입)
//		int a = 1.2345;(소수점 안됨)
		int a = (int)1.2345; //정수로 변환
		System.out.println(a); // 형변환은 되지만 데이터가 날아갈 수 있음
		
		// 캐스팅 형변환(참조형 타입)
		// 참조형은 상속관계에 있을 떄 가능하다
		// 업캐스팅
		Cat cat1 = new HouseCat();
		// 다운캐스팅 : 업캐스팅 된 객체를 다시 다운캐스팅 한다.		
		HouseCat cat2 = (HouseCat)cat1;
		
	}

};
