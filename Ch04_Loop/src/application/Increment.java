package application;

public class Increment {

	public static void main(String[] args) {
		// 증가 감소 연산자 (1씩 증가 또는 감소)
		int count = 0;
		
		count = count +1;
		System.out.println(count);
		count += 1;
		System.out.println(count);
		count++;
		System.out.println(count);
		++count;
		System.out.println(count);
		System.out.println("======");
		
		//위와 같이 4가지 방법으로 1씩 감소
		count = count -1;
		System.out.println(count);
		count = count -= 1;
		System.out.println(count);
		count--;
		System.out.println(count);
		--count;
		System.out.println(count);
		
		
	}

}
