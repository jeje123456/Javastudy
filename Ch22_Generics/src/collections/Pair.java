package collections;

public class Pair<T,S> {
	private T value1;
	private S value2;
	// 생성자
	public Pair(T value1, S value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	//source Generate getter and setter에서 get만 자동 생성
	public T getOne() {
		return value1;
	}
	public S getTwo() {
		return value2;
	}

	//2개의 클래스 타입의 toString메소드를 합쳐서 만듬
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(value1.toString());
		sb.append(" , ");
		sb.append(value2.toString());
		return sb.toString();
	}
}
