package ex1_chicken;

import java.util.ArrayList;
import java.util.List;

class Chicken {
	private String name;
	private int price;
	
	public Chicken(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
	public String getname() {
		return name;
	}
	
}

public class App {

	public static void main(String[] args) {
		List<Chicken> order =  new ArrayList<Chicken>();
		
		// 주문한 치킨을 입력
		order.add(new Chicken("로스트 치킨", 9900));
		order.add(new Chicken("파닭 치킨", 12900));
		order.add(new Chicken("마늘 치킨", 13900));
		
		// ArrayList를 순회하여 총합 구하기
		int sum = 0;
		for (Chicken price : order) {
			sum += price.getPrice();
			System.out.println("선택한 치킨은 : " + price.getname() + ", 가격 : " + price.getPrice());
		}
		
		//결과출력
		System.out.printf("총합 : %d원 \n", sum);
	}

}
