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
		File book = new File("book.txt"); 
		// 파일 앞에 절대주소가 없으면 상대주소로 현재 프로젝트 폴더를 뜻한다.
		System.out.println(Alice.exists()); // 파일 있는지 확인
		System.out.println(book.exists()); // 파일 있는지 확인
		// 중복되지않고 저장되는 건 TreeSet
		TreeSet<String> AliceList = loadWords(Alice);
		TreeSet<String> bookList = loadWords(book);
		
		System.out.println(AliceList.size());
		System.out.println(bookList.size());
/*		// 출력
		for(String w : AliceList) {
			System.out.println(w);
		}
*/	
		displayWords(AliceList);
	}
	/**
	 * list를 입력받아서 그 안에 단어들을 출력한다.
	 * @param List
	 */
	private static void displayWords(TreeSet<String> list) {
		int count = 0;
		for(String w : list) {
			// 한행에 단어를 6개씩 출력하고싶다.
			// -> 6개 작성하고 println으로 줄바꾸기
			System.out.printf("%-10s \t", w); 
			// 단어길이마다 다르니까 %와s사이에 숫자를 넣으면 
			// 그 숫자만큼 단어를 입력할 간격을 벌림(앞줄정렬하려면 -10입력)
			// 간격 \t = tab만큼 뜸
			// 줄바꿈 없이 철자 10개가 입력될 공간을 두고 탭만큼 띄운다.
			count++;
			if(count == 6) {
				System.out.println();// 한줄 띄우기
				count = 0;
			}
		}	
	}
	/**
	 * 입력된 파일을 읽어서 단어를 저장하고 마지막에 TreeSet 리스트로 리턴
	 * @param file
	 * @return wordSet
	 * @throws IOException 
	 */
	private static TreeSet<String> loadWords(File file) throws IOException {
		TreeSet<String> wordSet = new TreeSet<>();
		// 파일 읽기
		try (BufferedReader reader = new BufferedReader(new FileReader(file));){
			String line = null;
			while((line = reader.readLine()) != null) { // 파일 끝에 문자가 없으면 null이라서 종료됨
				//트리셋에 단어로 분리해서 입력한다.(자동정렬 및 중복제거)
				String[] words = line.split("[^a-zA-Z]+");
				for (String w : words) {
					if(w.length() > 10) {
						continue;
					}
					if(w.length() < 3) {
						continue;
					}
					wordSet.add(w.toLowerCase());//소문자로 단어 입력
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("위치에서 파일을 찾지 못했음 : " + file);
		} 
		return wordSet;
	}
}
