package writing_lineByline.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 일반적인 파일 읽기 방법 = Files 쓴 것 보다 빠르게 읽을 수 있다.
		String fileLocation = "E:\\Java502\\Java\\java-study\\Ch21_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
		System.out.println();
		
		// 파일 쓰기		
		// 자동으로 프로그램을 닫아주는 try-with-resources문 -> 다 이렇게 쓴다.
		try (BufferedWriter br = new BufferedWriter(new FileWriter(fileLocation));){
			br.write("오렌지");
			br.newLine();
			br.write("애플");
			br.newLine();
			br.write("바나나");
			br.newLine();
			br.write("배");
		} catch (IOException e) {
			// 파일을 읽지 못함 예외
//			e.printStackTrace();
			System.out.println("파일을 쓸 수 없음 : " + fileLocation);
		}
		System.out.println("파일 쓰기 완료 : " + fileLocation);
		System.out.println();
		
		// 파일 읽기
		try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation));){
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("위치에서 파일을 찾지 못했음 : " + fileLocation);
		} catch (IOException e) {
			System.out.println("파일을 읽지 못함 : " + fileLocation);
		}
	}
}
