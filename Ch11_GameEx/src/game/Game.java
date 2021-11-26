package game;


import java.util.Random;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	//사용할 가위, 바위, 보 객체를 배열로 생성
	GameObject[] objects = {new Scissors(), new Rock(), new Paper()};
	Random random = new Random();
	
	public void run() {
		System.out.println("게임 시작...");
//		 for(GameObject ob : objects) { (테스트용)
//			 System.out.println(ob.toString());
//		 }
		
		int num = random.nextInt(objects.length); //0,1,2 랜덤생성
		GameObject ob = objects[num];
		System.out.println(ob);//.toString이 생략되어있음.
//		System.out.println(ob.toString());//object 클래스의 toString메소드는 주소값 나옴
//		오버라이드 안했으면 주소값이 나오는데 오버라이딩 해서 객체의 정보가 나옴
	}
}
