package hashcode_this;

//클래스 박스 Fox
public class Fox {
	public String name;
	//ctrl + space
	public Fox() {
//		this = 본인객체의 주소
		System.out.println(this);
		this.name = "여우";
	}
}
