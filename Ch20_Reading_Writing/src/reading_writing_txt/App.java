package reading_writing_txt;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// 파일객체 만들기
		//File +c+s // "." = 파일의 위치로 현재폴더위치이다.
		File currentDirectory = new File(".");
//		File currentDirectory = new File("1.txt");// 현재 프로젝터 폴더 안에 있는 파일
		
		System.out.println(currentDirectory.getAbsolutePath());// currentDirectory의 절대경로 출력
		// 결과값 : E:\Java502\Java\java-study\Ch21_Reading_Writing\. = 현재 프로젝트 폴더
		System.out.println(currentDirectory.getCanonicalPath());// 파일의 정규 경로를 문자열로 반환
		// 결과값 : E:\Java502\Java\java-study\Ch21_Reading_Writing = 폴더까지만 출력됨
		// 에러 눌러서 예외처리
		// 해당 폴더에 1.txt 파일 만들고 확인
		// 폴더 내부 파일들을 출력해보자
		for(String f : currentDirectory.list()) { // .list() = 폴더 내부 파일과 폴더의 이름들
			System.out.println(f);
		}
	}
}
