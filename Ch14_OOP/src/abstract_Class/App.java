package abstract_Class;

public class App {

	public static void main(String[] args) {
		// 추상클래스
//		GameObject obj = new GameObject();
		//컴파일 오류 추상클래스의 인스턴스 생성 불가
		//= 추상클래스는 객체를 만들수 없다.
		//-> 추상클래스에는 실행코드가 없는 미완성 상태인 추상메소드가 있을수 있기 때문.
		
		GameObject[] objs = {new Player(), new Monster()};
		
		for(GameObject ob : objs) {
			System.out.println(ob);	
			ob.describe(); // 구현된 추상메소드
		}
		

		
		
	}

}
