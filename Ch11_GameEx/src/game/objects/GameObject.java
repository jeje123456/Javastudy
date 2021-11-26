package game.objects;

public class GameObject {
		// 부모클래스에 공통적으로 사용할 변수(이름) 선언
		private int id; //아이디
		private String name; //이름
		private int[][] comparison = {
				// 내가낸것(아래)		가위(0)	바위(1)	보(2)
				/* 가위(0) */		{	 0,		-1,		 1		},
				/* 바위(1) */		{	 1,		 0,		-1		},
				/* 보 (2) */		{	-1,		 1,		 0		}
		};
		
		// 상대의 (가위,바위,보)와 비교해서 결과 리턴하는 메소드
		// 매개변수 = 상대 가위바위보 = GameObject ob
		public int compareTo(GameObject ob) {
			return comparison[id][ob.id];
		}
		
		//getter setter
		//아이디 수정은 상속한 클래스에서만 사용
		protected int getId() {
			return id;
		}
		protected void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		//toString
		@Override //원래 Object의 toString메소드는 주소값을 나타내는데 메소드 오버라이드
		public String toString() {
			return "GameObject [id = " + id + ", name = " + name + "]";
		}
		
		


}
