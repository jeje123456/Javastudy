package stream_example;

import java.util.stream.Stream;

public class Generating_Stream {

	public static void main(String[] args) {
		// Stream.of
		Stream.of(1, 2, 3).forEach(i -> System.out.println(i));
		Stream.of("하나", "둘", "셋").forEach(t -> System.out.println(t));
		
		System.out.println();
		// generate메소드는 ()안의 리턴 결과로 스트림을 생성한다.
		// 이때 무한대로 생성하므로 limit로 갯수를 제한한다.
		Stream.generate(() -> "헬로우").limit(10).forEach(System.out::println);
	}

}
