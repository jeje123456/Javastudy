package stream_example;

import java.util.stream.IntStream;

public class Int_Stream {

	public static void main(String[] args) {
		// Stream 생성방법
		IntStream
			.range(1, 10) // 1에서 10-1까지 정수
			.skip(5) // 5개의 정수를 스킵함(넘김)
			.forEach(i -> System.out.println(i));
		
		System.out.println();
		 // 1부터 10-1까지의 합을 리턴
		int val = IntStream.range(1, 10).sum();
		System.out.println(val); 
		// sum, max, min, avg, count 가능
	}

}
