package hashMap;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// 해시맵은 key,value값을 입력한다.(인덱스 없음 = 순서없음)
		// HashMap<K, V> = 제네릭타입 2개<key의타입, value의타입>
		HashMap<Integer, String> people = new HashMap<>();
		people.put(0, "무");
		people.put(1, "래기");
		people.put(3, "삼색이");
		people.put(4, "뚱땅이");
		people.put(4, "도도"); //키값은 중복되지 않는다(같으면 업데이트됨)
		people.put(7, "마릴린");
		
		// 람다식으로 HashMap 읽기
		people.forEach((k,v)->System.out.println(k + ":" + v));
		// get으로 특정 key의 value값 읽기
		System.out.println(people.get(4)); //key값 4의 value값 출력
	}

}
