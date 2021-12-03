package throwing_exception;

public class App {

	public static void main(String[] args) throws Exception {
		//객체생성
		Thermostat stat = new Thermostat();
		/*
		stat.setTemperature(30);
		Thermostat 클래스의
		System.out.println("온도세팅 : " + temperature); 출력됨
		*/
		stat.setTemperature(37);
		// 에러눌러서 throw Exception클릭
	}

}
