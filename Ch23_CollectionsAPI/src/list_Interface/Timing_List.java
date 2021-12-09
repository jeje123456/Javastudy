package list_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_List {
	public static void main(String[] args) {
		// Array리스트와 Linked리스트의 실행시간체크
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		long duration1 = timeOPerations(arrayList);
		System.out.println("측정시간 : " + duration1); // 0.004초, 0.035초
		long duration2 = timeOPerations(linkedList);
		System.out.println("측정시간 : " + duration2); // 0.017초, 0.006초
		// 일반적인 순서대로 입력은 Array리스트가 더 빠름
		// 특정 인덱스 번호에 입력이나 제거는 Linked리스트가 더 빠름
		
/*		// 시간체크 하는법
		long time1 = System.currentTimeMillis(); // 현재시간을 1/1000초(밀리세컨드)로 리턴
		System.out.println(time1);
		// 리스트 실행하고
		for(int i=0; i < 10000; i++) {
			System.out.println(i);
		}
		long time2 = System.currentTimeMillis(); // 시간 한번 더 체크
		System.out.println(time2-time1); //181 = 0.18초
*/
	}
	
	public static long timeOPerations(List<Integer> list) {
		long start = System.currentTimeMillis(); // 시간측정
/*		for(int i=0; i < 10000; i++) {
			list.add(i); // 0부터 10000-1까지 리스트에 하나씩 입력
		}
*/		for(int i=0; i < 10000; i++) {
		list.add(0, i); // 0번째 인덱스에 i값 계속 입력
		}
		return System.currentTimeMillis() - start; // 실행시간 리턴
	}
}
