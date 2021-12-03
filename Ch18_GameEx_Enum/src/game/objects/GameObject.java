package game.objects;

//class -> enum 수정
public enum GameObject {
	//name = 가위,바위,보라는 상수값으로 대체
	//id = enum 인덱스번호로 대체
	//이와같이 enum을 객체처럼 사용해서 프로그램을 수정
	
	가위, 바위, 보; // enum 가위, 바위, 보
//	 0,	  1,  2 (가위바위보의 인덱스번호)

	private int[][] comparison = {
			// 내가낸것(아래) 가위(0) 바위(1) 보(2)
			/* 가위(0) */ 	{ 0,  	-1,  1 }, 
			/* 바위(1) */ 	{ 1,   	0, 	-1 }, 
			/* 보 (2) */ 	{ -1,  	1, 	 0 } };

	// 상대의 (가위,바위,보)와 비교해서 결과 리턴하는 메소드
	// 매개변수 = 상대 가위바위보 = GameObject ob
	public int compare(GameObject ob) {
		return comparison[this.ordinal()][ob.ordinal()];
//								[내가 낸 것][]
//		enum끼리 비교해서 인덱스 번호로 비교	
	}

}
