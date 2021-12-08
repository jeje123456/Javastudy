package file_location;

import java.io.File;

public class App {

	public static void main(String[] args) {
		// 파일 위치
		//E:\Java502\Java\java-study\Ch21_Reading_Writing에 test.txt파일 생성
		String fileLocation = "E:\\Java502\\Java\\java-study\\Ch21_Reading_Writing\\test.txt";
		// ch21 우클릭 refresh해서 test.txt를 자바에서 열어서 내용 입력
		//위의 파일 주소로 파일 객체 생성 메소드 exists는 파일이 있으면 true, 없으면 false 리턴
		System.out.println(new File(fileLocation).exists()); // 결과값 : true
		// test.txt를 test1.txt로 이름을 바꾸면 false가 나옴
	}
}
