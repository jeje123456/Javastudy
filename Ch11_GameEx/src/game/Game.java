package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	//사용할 가위, 바위, 보 객체를 배열로 생성
	GameObject[] objects = {new Scissors(), new Rock(), new Paper()};
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	

	
	public void run() {
//		System.out.println("게임 시작...");
//		 for(GameObject ob : objects) { (테스트용)
//			 System.out.println(ob.toString());
//		 }
		System.out.println("삼세판 게임 시작...");
		int wins = 0;
		
		for(int i=1; i<=3; i++) {//i는 1부터 3까지 3번 반복
			//유저가 선택하기
			System.out.println("가위(0), 바위(1), 보(2) 중 숫자로 선택 : ");
//			int num = scanner.nextInt();
			
//			int num = random.nextInt(objects.length); //0,1,2 랜덤생성
//			GameObject ob = objects[num];
			//간소화
//			GameObject ob1 = objects[random.nextInt(objects.length)];
			GameObject ob2 = objects[random.nextInt(objects.length)];
			GameObject ob1 = objects[scanner.nextInt()];
			
			System.out.println("당신의 선택은 : " + ob1.getName());//.toString이 생략되어있음.
			System.out.println("컴퓨터의 선택은 : " + ob2.getName());//.toString이 생략되어있음.
//			System.out.println(ob.toString());//object 클래스의 toString메소드는 주소값 나옴
//			오버라이드 안했으면 주소값이 나오는데 오버라이딩 해서 객체의 정보가 나옴
//			주소값에 객체의 정보가 오버라이딩되어서 출력되는 것.
//			toString을 주석처리하면 ob의 주소값(game.objects.Paper@33833882)이 나온다.
//			이것은 Object 클래스에 있는 toString값이 나오는 것이다
//			Object o; //Object클래스에 대해 알고싶다 -> ctrl+click
			
			//comparison배열 메소드로 결과 도출
//			int result = ob1.comparisonTo(ob2);
//			System.out.println(result);	
			int result = ob1.compareTo(ob2);
			wins += result;
			if(result>0) {
				System.out.println("당신의 승리!🚀");
			}
			else if(result<0) {
				System.out.println("당신의 패배!🏳");
			}
			else {
				System.out.println("비겼습니다! Draw!🌋🌋");
			}
		}
		// 3번의 가위바위보 끝난 후
		// 총점 wins로 전체 결과를 출력
		System.out.println();
		System.out.println("삼세판 결과는 : ");
		if(wins>0) {
			System.out.println("당신의 승리!🚀");
		}
		else if(wins<0) {
			System.out.println("당신의 패배!🏳");
		}
		else {
			System.out.println("비겼습니다! Draw!🌋🌋");
		}
	}
	
}
