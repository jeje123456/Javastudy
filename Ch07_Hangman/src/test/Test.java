package test;

import java.util.Random;

//다른 패키지에 있는 객체를 사용할 때 사용
//RandomWorl에서 ctrl + space - import 자동으로 불러옴
//import application.RandomWord;

public class Test {
	public static void main(String[] args) {
//		RandomWord r = new RandomWord();
//		r.getWords();//전체단어출력
//		System.out.println(r.toString()); //선택된 단어 출력
		//랜덤으로 단어를 가져오는 방법
		// Random에서 ctrl+space -> Random-java.until 선택
		Random random = new Random();
		String[] words = {"펭수","고양이","라이언","늑대","여우"};
		
// 메소드 random.nextInt(숫자) = 숫자까지 랜덤으로 입력된다.
// nextInt : 괄호안의 단어의 길이만큼 = 0~(배열갯수-1)만큼 랜덤으로 출력
		// 랜덤 데이터 3번 얻기
		for(int i=0; i<3; i++) {
		int randomIndex = random.nextInt(words.length);
		System.out.println("randomIndex = "+ randomIndex);
		System.out.println(words[randomIndex]);
		}
	}

}