package abstract_Class;

//class Monster는 GameObject를 상속
public class Monster extends GameObject {
	// 추상클래스 구현 -> describe메소드 작성
	// 오류눌러서 add unimplemented methods 클릭
	@Override
	public void describe() {
		System.out.println("몬스터입니다.");
		
	}
//GameObject상속
	
}
