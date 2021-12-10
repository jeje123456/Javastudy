package ex2_lotto;

import java.util.Random;

public class App { //번호 출력 클래스

	public static void main(String[] args) {
		LottoMachine machine = new LottoMachine();
		
		System.out.println("이번주의 로또 번호는 : ");
		for(int i : machine.getLottonumbers()) {
			System.out.println(i);
		}
	}
}

class LottoMachine{ //랜덤번호 생성 클래스
	private int[] lottonumbers; //선택된 숫자 6개 배열
	
	public LottoMachine() {
		lottonumbers = randomMachine();
	}
	
	public int[] randomMachine() {
		int[] pickedNumbers = new int[6]; // 배열은 갯수를 정해줘야 사용할수 있다.
		
		
		Random randomNumbers = new Random();
		
		//임의의 숫자 6개를 pickedNumbers에 입력
		for(int i=0; i<6; i++) {
			pickedNumbers[i] = randomNumbers.nextInt(45)+1;
		}
		return pickedNumbers;
	}

	public int[] getLottonumbers() { 
		return lottonumbers;
	}
	
}

/*
로또 
1. 선택된 번호 출력 클래스:  App
-  LottoMachine 객체 선언 : machine
-> 로또머신의 생성자 실행 

2. 랜덤 번호 6개 선택 클래스
 : class LottoMachine
- 선택된 번호 6개 배열 선언
: lottoNumbers
- 생성자
: lottoNumbers 는 랜덤 메소드의 리턴값
- 숫자 45개중에 6개를 선택하는 메소드 : randomMachine
-> 랜덤 객체 : randomNumbers
-> 랜덤 숫자 배열 : pickedNumbers
*/
