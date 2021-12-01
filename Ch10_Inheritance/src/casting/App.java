package casting;

public class App {

	public static void main(String[] args) {
		// 캐스팅 실습
		Cat cat1 = new HouseCat(); //객체는 하우스캣
		cat1.vocal();
		cat1.hunt();
		//cat1은 Cat타입이기 때문에 Cat 클래스에 없는 메소드는 사용불가
		//오버라이딩은 된다(Cat의 vocal말고 HouseCat의 vocal 출력됨)
//		cat1.call();
		
		//call을 사용하기위해 다운캐스팅
		HouseCat cat2 = (HouseCat)cat1;
		cat2.call(); //cat1.call();로하면 안됨
		// 다운캐스팅해도 객체는 1개!!
		HouseCat cat3 = (HouseCat)cat1;
		cat3.call(); //뭐를 Cat으로 바꿨는데 기억안남
		// 컴파일러가 에러 표시를 해주지 않기 때문에 실행하면 실시간 에러 발생

	}

};
