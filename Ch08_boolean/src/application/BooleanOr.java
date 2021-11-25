package application;

public class BooleanOr {
	
	public static void main(String[] args) {
		// A || B = 둘중에 하나라도 참이면 참
		boolean isRaining = true; //비가 오는가?
		boolean mightRaining = false; //비가 올 수도 있는가?
		boolean takeUmbrella = false;//우산을 썼는가?
		
		takeUmbrella = isRaining || mightRaining;
		System.out.println(takeUmbrella);
	}
}
