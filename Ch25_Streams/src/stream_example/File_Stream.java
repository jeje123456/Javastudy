package stream_example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File_Stream {

	public static void main(String[] args) throws IOException {
		// 자바의 Files 클래스의 lines 메소드는 해당 파일의 각 라인을 스트링타입의 스트림으로 만들어준다.
		// 파일을 읽어서 한줄씩 문자열 스트림을 생성해서 forEach문으로 한줄씩 출력한다.
		// 파일 찾기
		Path path = Paths.get("E:\\Java502\\Java\\java-study\\Ch22_CollectionsAPI\\book.txt");
		
		Files.lines(path).forEach(s -> System.out.println(s));
		// 오류 눌러서 throw 클릭
		// .filter나 .map을 써서 문자열을 처리할 수 있다.
	}
}
