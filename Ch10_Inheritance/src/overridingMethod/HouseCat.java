package overridingMethod;

public class HouseCat extends Cat {
	// @Over 치고 ctrl + space (@=알파)
	@Override //어노테이션 오버라디드
	//오버라이딩 메소드 : 자식클래스에서 부모와 똑같은 메소드를 만듬
	public void vocal() {
		System.out.println("미야옹~");
	}
}
