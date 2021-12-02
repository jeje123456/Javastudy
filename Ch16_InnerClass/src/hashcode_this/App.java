package hashcode_this;

public class App {

	public static void main(String[] args) {
		Fox fox1 = new Fox(); //Fox메소드에 의해 주소값 출력
		System.out.println(fox1);
		System.out.println(fox1.toString());
		//해시코드(주소값끝에 나오는것)
		System.out.println(fox1.hashCode());
		//해시코드 16진수로 변환하여 출력 // %x = 16진수출력가능
		System.out.printf("%x\n", fox1.hashCode());
		
		System.out.println("--------------");
		Fox fox2 = fox1;
		System.out.println(fox2);
		
		System.out.println(fox2.name);
	}

}
