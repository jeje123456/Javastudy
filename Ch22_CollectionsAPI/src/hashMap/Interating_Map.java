package hashMap;

import java.util.HashMap;

public class Interating_Map {

	public static void main(String[] args) {
		// Map타입을 반복문으로 출력하기
		
		HashMap<String, String> months = new HashMap<>();
		months.put("JAN", "1월");
		months.put("FEB", "2월");
		months.put("MAR", "3월");
		months.put("APR", "4월");
		months.put("MAY", "5월");
		months.put("JUN", "6월");

		// 1. 람다식으로 출력
		months.forEach((k,v) -> System.out.println(k + " : " + v));
		System.out.println();
		// 2. entrySet() : months맵의.key값과 value값 가져오기
		// for(Map.Entry<String, String> entry : months.entrySet())
		// 위에꺼로 하면 복잡해서 var = 자동으로 가져와줌 //JDK10버전 이상일때
		for( var entry : months.entrySet()){ 
			String k = entry.getKey(); // key값 출력해서 입력
			String v = entry.getValue(); // value값 출력해서 입력
			System.out.println(k + " : " + v);
		}
		System.out.println();
		// 3. keySet() : months의.key값만 가지고 오기
		for (String key : months.keySet()) {
			String v = months.get(key); //키값으로 value값 가져오기
			System.out.println(key + " : " + v);
		}
	}

}
