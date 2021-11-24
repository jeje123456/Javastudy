package returnValue;

public class App {

	public static void main(String[] args) {
		// 리턴값이 있는 메소드 사용
		ReturnMethod r1 = new ReturnMethod();
		
		// r1.getAnimal(); // 결과:고양이를 리턴합니다.
		// void getAnimal()을 String getAnimal()로 수정
		String cat = r1.getAnimal();
		
		System.out.println("캣변수는 : " + cat);
	}

}
