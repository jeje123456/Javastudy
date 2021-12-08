package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_list {

	public static void main(String[] args) {
		// 리스트를 정렬
		ArrayList<Double> doubles = new ArrayList<>();
		
		doubles.add(7.38);
		doubles.add(3.88);
		doubles.add(1.45);
		doubles.add(2.35);
		doubles.add(9.78);
		
		doubles.forEach(System.out::println);
		System.out.println("--------");
		
		Collections.sort(doubles); // Collections를 사용하여 정렬
		doubles.forEach(System.out::println);
	}

}
