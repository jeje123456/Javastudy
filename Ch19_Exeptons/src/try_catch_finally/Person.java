package try_catch_finally;

public class Person {
	private String name;
	//null값 입력안되게 막아줌
	public void setName(String name) throws Exception {
		if (name == null) {
			throw new Exception("이름에 null값을 입력할 수 없습니다.");
		}
		this.name = name;
		System.out.println("이름은 " + name);
	}
}
