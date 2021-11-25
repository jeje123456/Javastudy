package application;

public class BooleanAndOr {

	public static void main(String[] args) {
		// && 와 ||을 합쳐서 사용
		boolean isRaining = true; //비가 오는가?
		boolean mightRaining = false; //비가 올 수도 있는가?
		boolean haveUmbrella = true; //우산을 가지고 있나?
		//첫번째 표현
		if((isRaining || mightRaining) && haveUmbrella) {
			System.out.println("비가 오거나 올 수 있고 우산이 있다!");
		}
		else {
			System.out.println("비가 오거나 올 수 있지만 우산이 없다!");
		}
		//두번째표현
		haveUmbrella = false; //우산을 가지고 있나?
		boolean raincheck = isRaining || mightRaining;
		
		if(raincheck && haveUmbrella) {
			System.out.println("비가 오거나 올 수 있고 우산이 있다!");
		}
		else {
			System.out.println("비가 오거나 올 수 있지만 우산이 없다!");
		}
		
	}

}
