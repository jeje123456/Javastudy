package throwing_exception2;

public class Thermostat {
	
	//예외처리 throws는 해당 예외처리를 이 메소드를 호출할 때 처리하도록 함
	public void setTemperature(double temperature) throws Exception {
		
		setMachinTemperature(temperature);
		//오류눌러서 메소드문 작성
	
		if(temperature < 0 || temperature > 35) {
			throw new Exception("온도가 비정상 입니다."); // trow로 새 예외를 생성
		}
		// 에러눌러서 throw Exception클릭
		
		System.out.println("온도세팅 : " + temperature);
	}

	private void setMachinTemperature(double temperature) throws Exception {
		if(temperature < 0 || temperature > 35) {
			throw new Exception("온도가 비정상 입니다.");
			// 에러눌러서 throw Exception클릭
		}
	}
}