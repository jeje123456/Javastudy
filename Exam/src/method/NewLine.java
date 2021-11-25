package method;

public class NewLine {

	public static void main(String[] args) {
		System.out.println("Line 1");
		//NewLine.threeLines(); // 같은 클래스 안에서는 클래스명 생략가능
		threeLines();
		System.out.println("Line 2");
		}
		
		public static void threeLines() {
			oneLine();
			oneLine();
			oneLine();
		}
		
		public static void oneLine() {
			System.out.println(">");
		}
		
}


