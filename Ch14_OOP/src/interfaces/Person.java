package interfaces;

//인터페이스를 구현(상속)할 때 implements 사용
//상속한 클래스에서 추상메소드 완성(구현)
public class Person implements Describable{
//	오류눌러서 add unimplemented methods 클릭
	@Override
	public String getDescription() {
		return "사람입니다.";
	}
}
