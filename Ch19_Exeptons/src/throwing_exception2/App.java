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
			e.printStackTrace();

		}
	}
}
