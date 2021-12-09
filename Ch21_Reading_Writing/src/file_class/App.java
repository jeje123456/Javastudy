package file_class;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {
		// 텍스트 읽고 쓰기
		String text = "헬로우! \n 하와유?"; // 적을 내용
		// Path+c+s -> import
		Path path =  Paths.get("text.txt"); 
		
		// 텍스트 쓰기 : text.txt에 위릐 text내용을 적기
		// Files+c+s -> import //.wr -> write선택 // (path, null, null)의 널값 입력
		// Files클래스의 스테틱 메소드 write로 (적을파일의 경로, 적을내용(byte단위 : 0과 1))
		// 컴퓨터는 문자열을 읽을 수 없기때문에 byte단위로 변환
		 Files.write(path, text.getBytes()); // 파일이 없을경우 만들어줌
		// 실행하고 ch21 우클릭 -> refresh -> 파일이 생겨있음 -> text변수의 내용이 적혀있다.
		
		// 텍스트 읽기
		// 파일이 작성되었으니 Files.write(path, text.getBytes()); 주석처리
		String recivedText = Files.readString(path);
		System.out.println(recivedText);
		// text.txt에 다른내용 추가하고 한번 더 실행
		
		// 텍스트 덮어씌우기
		// E:\Java502\Java\에 new.txt 파일 생성하고 내용입력
		String text1 = "헬로우! \n 하와유?";
		Path path1 =  Paths.get("E:\\Java502\\Java\\new.txt"); // 역슬래쉬가 특수문자여서 역슬래쉬 2줄됨
		Files.write(path1, text1.getBytes()); 
		// String 바로 아래에 위의 2줄을 작성해야지만 내용이 덮어씌워진다.
	}
}
