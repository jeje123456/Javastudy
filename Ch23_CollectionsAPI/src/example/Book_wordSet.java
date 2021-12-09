package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) throws IOException {
		// 책 전체 내용을 읽어서 단어로 분리해서 리스트에 넣기
		// 이때 리스트는 단어가 중복되지 않는다. 알파벳 순으로 저장
		// TODO Auto-generated method stub
		File Alice = new File("Alice.txt"); 
		// 파일 앞에 절대주소가 없으면 상대주소로 현재 프로젝트 폴더를 뜻한다.
		System.out.println(Alice.exists()); // 파일 있는지 확인
		// 중복되지않고 저장되는 건 TreeSet
		TreeSet<String> AliceList = loadWords(Alice);
		
		System.out.println(AliceList.size());
		
		for(String w : AliceList) {
			System.out.println(w);
		}
		
	}
	/**
	 * 입력된 파일을 읽어서 단어를 저장하고 마지막에 TreeSet 리스트로 리턴
	 * @param alice
	 * @return
	 * @throws IOException 
	 */
	private static TreeSet<String> loadWords(File alice) throws IOException {
		TreeSet<String> wordSet = new TreeSet<>();
		// 파일 읽기
		try (BufferedReader reader = new BufferedReader(new FileReader(alice));){
			String line = null;
			while((line = reader.readLine()) != null) { // 파일 끝에 문자가 없으면 null이라서 종료됨
				//트리셋에 단어로 분리해서 입력한다.(자동정렬 및 중복제거)
				String[] words = line.split("[^a-zA-Z]+");
				for (String w : words) {
					if(w.length() < 6) {
						continue;
					}
					wordSet.add(w.toLowerCase());//소문자로 단어 입력
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("위치에서 파일을 찾지 못했음 : " + alice);
		} 
		return wordSet;
	}
}
