package reading_lineByline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 일반적인 파일 읽기 방법 = Files 쓴 것 보다 빠르게 읽을 수 있다.
/*		String fileLocation = "E:\\Java502\\Java\\java-study\\Ch21_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
		
		// 블로그 설명 보기 -> 바이트단위로 전체를 읽으면 좀 느림
		// 처음에는 바이트 단위로 읽고 그다음에 여러글자로 읽을 수 있다는 말
		// Buffered 안에 FileReader가 있다
//		BufferedReader reader = new BufferedReader(filelocation); //하면 안됨
		// 바이트 단위로 읽어주는 과정 필요함 new FileReader 객체 생성
//		BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
		//오류 눌러서 try-catch문 선택
		try {
			// 파일을 읽기 위한 객체 생성
			BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
			// 파일 읽기
			String line = null;
			while((line = reader.readLine()) != null) { // 파일의 끝에 더이상 문자가 없으면 null값 리턴됨
				System.out.println(line); // 더이상 읽을 줄이 없을때까지 읽어서 한줄식 출력한다.
				// 에러클릭 -> 두번째 catch문 생성 선택
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// 실제 파일을 못 찾았을 경우 실행
//			e.printStackTrace(); // 빨간색 예외처리 출력
			System.out.println("위치에서 파일을 찾지 못했음 : " + fileLocation);
		} catch (IOException e) {
			// 파일을 읽지 못함 예외
//			e.printStackTrace();
			System.out.println("파일을 읽지 못함 : " + fileLocation);
		}
*/		//test1.txt를 다시 test.txt로 바꾸고 실행
		// warning -> 파일을 다 읽은뒤에 읽는 프로그램 닫아줘야됨
		// reader가 try문 안에 있으므로 지역변수라서 while문 바로 아래에서 닫아줘야한다.
		
		// 자동으로 프로그램을 닫아주는 try-with-resources문 -> 다 이렇게 쓴다.
		String fileLocation = "E:\\Java502\\Java\\java-study\\Ch21_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation));){
			// 파일 읽기
			String line = null;
			while((line = reader.readLine()) != null) { // 파일의 끝에 더이상 문자가 없으면 null값 리턴됨
				System.out.println(line); // 더이상 읽을 줄이 없을때까지 읽어서 한줄식 출력한다.
				// 에러클릭 -> 두번째 catch문 생성 선택
			}
		} catch (FileNotFoundException e) {
			// 실제 파일을 못 찾았을 경우 실행
//			e.printStackTrace(); // 빨간색 예외처리 출력
			System.out.println("위치에서 파일을 찾지 못했음 : " + fileLocation);
		} catch (IOException e) {
			// 파일을 읽지 못함 예외
//			e.printStackTrace();
			System.out.println("파일을 읽지 못함 : " + fileLocation);
		}
	}
}
