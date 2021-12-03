package throwing_runtime_exception;

public class Thermostat {
	
	//예외처리 throws는 해당 예외처리를 이 메소드를 호출할 때 처리하도록 함
	public void setTemperature(double temperature) {
		
		setMachinTemperature(temperature);
		//오류눌러서 메소드문 작성
	
		System.out.println("온도세팅 : " + temperature);
	}
//	Exception앞에 Runtime 적고 throws Exception 삭제해도 오류안남
//	runtime
	private void setMachinTemperature(double temperature) {
		if(temperature < 0 || temperature > 35) {
			throw new RuntimeException("온도가 비정상 입니다.");
			// 에러눌러서 throw Exception클릭
		}
	}
}