package custom_exception.exceptions;

//extends Exception 을 붙이면 Exception을 상속받아서 새 예외 클래스를 만든다.
public class TempOutOfRangeException extends Exception{
// 오류 눌러서 default sirial number id 생성
	private static final long serialVersionUID = 1L;
	
	//c+s로 메소드 생성
	public TempOutOfRangeException(String message) {
		super(message); // 입력된 메세지로 새 예외 객체 생성
	}
}
