package lambda_example;
// 폴더에 i표시는 interface의 약자
// 람다식을 쓰려면 functional interface이어야 한다.
//@ + F + c+ s -> functional interface -> 에러발생
// -> 추상메소드 생성
@FunctionalInterface
public interface Test {
	// 추상메소드 런을 생성 -> 함수형 인터페이스 조건 만족
	void run(); 
//	void run2(); 
//	함수형 인터페이스는 하나의! 추상메소드만 가진 인터페이스이다.
}
