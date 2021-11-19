package application;

public class Switch {

	public static void main(String[] args) {
//switch(변수){case 0: 명령문1;break; case 1: 명령문2;break; ...; defalt: 명령문;break;}
		int option = 0;
		
		switch(option) {
		case 0: // 옵션 변수가 0과 같을 때
			System.out.println("옵션 0 선택");
			break; // 항상 케이스 하나의 끝에 break 작성
		case 1: // 옵션 변수가 1과 같을 때
			System.out.println("옵션 1 선택");
			break;
		case 10: // 옵션 변수가 10과 같을 때
			System.out.println("옵션 10 선택");
			break;
		default: // else와 같음, 위의 케이스에 맞는 것이 없을때 실행
			System.out.println("잘못된 옵션 번호");
			break;
		}
		
	}

}
