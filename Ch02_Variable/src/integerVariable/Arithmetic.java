package integerVariable;

public class Arithmetic {

	public static void main(String[] args) {
		// 숫자계산
		System.out.println(7+3);
		System.out.println(9/3);
		
		System.out.println(10/3); // (정수/정수) = 정수 3
		
		System.out.println(10.0/3.0);
		System.out.println(9/4.0); // (정수/실수) 일때는 더 큰 값의 타입으로 출력(실수)
		System.out.println(3*4); 
		System.out.println(3*4.0); //(정수*실수) = 실수로 결과 출력
		System.out.println(3-4);
	}

}
