package throwing_exception2;

public class App {

	public static void main(String[] args) {
		//객체생성
		Thermostat stat = new Thermostat();

		// 에러눌러서 try/catch클릭
		try {
			stat.setTemperature(37);
		} catch (Exception e) {
			// 온도예외발생
			//e.printStackTrace();
			//위의 코드로 해두면 어디에서 에러가 발생했는지 순서대로 출력됨
			System.out.println(e.getMessage());
			//e.getMessage() = "온도가 비정상 입니다."
		}
	}
}
