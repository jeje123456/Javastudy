package application;

public class PreAndPost {

	public static void main(String[] args) {
		// 증감연산자 ++, -- 위치에 따라 다름
		// 뒤에 있을 경우 먼저 사용하고 증감
		//후위 증감 n++, n-- 다른 연산 수행 후 1증가, 1감소
		// 앞에 있을 경우 먼저 증감하고 사용
		//전위 증감 ++n, --n 다른 연산 수행 전 1증가,1감소
		int x = 5;
		System.out.println("후위증감 x++ :" + x++);
		System.out.println(x);
		
		int y = 5;
		System.out.println("전위증감 ++y :" + ++y);
		
		int z = 10;
		int sum = x + z++;
		System.out.println(sum);
		
		int a = 5;
		int b = 4;
		int c = ++a + b++;
		System.out.println(c);
		
	}

}
