package entities;

public class Fruit {
	// protected는 다른 패키지에서는 사용할 수 없다.
	// 상속한 자식클래스에서만 사용가능
	protected int id;

	@Override
	public String toString() {
		return "Fruit [id=" + id + "]";
	}

}
