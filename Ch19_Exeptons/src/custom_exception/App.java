package custom_exception;

import custom_exception.exceptions.TempOutOfRangeException;
import custom_exception.exceptions.TempTooHighException;

public class App {

	public static void main(String[] args) {
		//객체생성
		Thermostat stat = new Thermostat();

		// 에러눌러서 try/catch클릭
		/*
		try {
			stat.setTemperature(37);
		} catch (TempOutOfRangeException e) {
			//Exception e를 TempOutOfRangeException로 변경
			System.out.println(e.getMessage());
			//e.getMessage() = "온도가 비정상 입니다."
		}	*/
		try {
			stat.setTemperature(-37);
			
//			TempOutOfRangeException 를 TempTooHighException로 변경 후
//			오류 눌러서 2번째꺼 add catch clause to surrounding try 클릭
		} catch (TempTooHighException e) {
			//온도가 높을 때
			System.out.println(e.getMessage());
			
		} catch (TempOutOfRangeException e) {
			//온도가 낮을 때
			System.out.println(e.getMessage());
			
		}
	}
}
