package try_catch_finally;

public class App {
	
	
/*		//throws
	 	public static void main(String[] args) throws Exception {
		
		Person p1 = new Person();
		
			p1.setName(null);
		
		System.out.println("프로그램 종료");

	}
*/
/*		//try-catch
		public static void main(String[] args) {
			
			Person p1 = new Person();
			
			try {
				p1.setName(null);
				System.out.println("예외 발생시 여기는 실행 안됨");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("프로그램 종료");
	
		}
*/
		//try-catch-finally
		public static void main(String[] args) {
				
				Person p1 = new Person();
				
				try {
					p1.setName("라이언");
					System.out.println("예외 발생시 여기는 실행 안됨");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				} finally { //fi치고 +c+s
					//여기는 예외가 발생하든 안하든 무조건 실행
					System.out.println("finally 무조건 실행");
				}
				System.out.println("프로그램 종료");
		
			}
}
