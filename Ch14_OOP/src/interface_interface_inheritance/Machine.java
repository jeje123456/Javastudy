package interface_interface_inheritance;

public class Machine implements DefaultRunnable{
// add 클릭
	@Override
	public void run() {
		System.out.println("머신러닝!");
		
	}

	//default 넣어서 주석처리해도 실행됨
//	@Override
//	public void displayDetails() {
//		System.out.println("표시할 디테일 업음");
//		
//	}
	
}
