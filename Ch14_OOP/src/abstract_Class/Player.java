package abstract_Class;

public class Player extends GameObject {
	// 추상클래스 GameObject 구현 -> describe메소드 작성
	// 오류눌러서 add unimplemented methods 클릭
	@Override
	public void describe() {
		// 추상클래스의 추상메소드 describe()를 완성시킨다.
		System.out.println("플레이어입니다.");
	}
//GameObject 추가클래스를 구현한 서브 클래스는 App에 인스턴스를 생성할 수 있다.
	
}
