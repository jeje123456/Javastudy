package interface_interface_inheritance;

//runnable이라는 메소드가 있음 ctrl + 클릭
//인터페이스끼리 상속가능
public interface DefaultRunnable extends Runnable{
//	void displayDetails(); //추상메소드
	default void displayDetails() {
		System.out.println("표시할 디테일 없음");
	}; //디폴트 메소드는 구현가능
	
}
