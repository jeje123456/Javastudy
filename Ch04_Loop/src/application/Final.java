package application;

public class Final {

	public static void main(String[] args) {
		// 변수 앞에 final이 붙으면 상수(변하지않는 값)가 됨.
		final int VALUE = 9; //상수는 대문자로 //변하지 않는 정수가 됨 
		// VALUE = 11; 상수는 새로운 값을 대입할 수 없다.
		final String USER_PASSWORD = "abc";
		// USER_PASSWORD = "ABC"; 안됨
		
		System.out.println(VALUE);
		System.out.println(USER_PASSWORD);		

	}

}
