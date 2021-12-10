package ex1_chicken;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Chicken1 {
	private String name;
	private int price;
	
	public Chicken1(String name, int price) {
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

public class App2 {

	public static void main(String[] args) {
		int sum = 0;

		
		Scanner scanner = new Scanner(System.in);
		List<Chicken1> order =  new ArrayList<Chicken1>();
	
		System.out.println("주문할 메뉴가 없으면 '주문종료'를 입력해주세요");
		while(true) {
			System.out.println("주문할 메뉴는 : ");
			String input = scanner.nextLine();
			input = input.replace(" ", "");

			if(input.equalsIgnoreCase("주문완료")) {
				System.out.println("주문종료");
				//결과출력
				for (Chicken1 orders : order) {
					System.out.println("선택한 치킨은 : " + orders.getname() + ", 가격 : " + orders.getPrice());
				}
				System.out.printf("총 주문 금액 : %d원 \n", sum);
				scanner.close();
				break;
			}
			try {
				if (input.equals("후라이드치킨")) {order.add(new Chicken1("후라이드 치킨", 9900));}
				else if (input.equals("로스트치킨")) {order.add(new Chicken1("로스트 치킨", 9900));}
				else if (input.equals("양념치킨")) {order.add(new Chicken1("양념 치킨", 10900));}
				else if (input.equals("파닭치킨")) {order.add(new Chicken1("파닭 치킨", 12900));}
				else if (input.equals("마늘치킨")) {order.add(new Chicken1("마늘 치킨", 13900));}
				else {System.out.println("없는 메뉴입니다. 다시 입력하세요.");}
				for (Chicken1 price : order) {
					sum += price.getPrice();
				}
			}
			catch (Exception e) {
				System.out.println("오류발생");
			}	
		}
	}
}