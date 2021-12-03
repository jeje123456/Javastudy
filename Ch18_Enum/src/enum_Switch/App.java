package enum_Switch;

public class App {

	public static void main(String[] args) {
		Fruit f = Fruit.ORANGE;
		
		switch(f) { 
		case ORANGE :
			System.out.println("오렌지");
		case BANANA :
			System.out.println("바나나");
		case APPLE :
			System.out.println("사과");
		default :
			System.out.println("없는 과일입니다.");
		}
	}
}
