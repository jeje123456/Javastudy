package instance_of;

import java.io.Serializable;

class Creature implements Serializable{
	private static final long serialVersionUID = 1L;
	
}

class Cat extends Creature{
	private static final long serialVersionUID = 1L;
	
}
public class App {
	public static void main(String[] args) {
		// instanceof 클래스 : 객체의 타입을 판별해서 클래스의 객체가 맞으면 true 아니면 false
		Creature c1 = new Creature();
		Object c2 = c1; 
		
		Cat c3 = new Cat();
		Serializable c4 = (Serializable)c3;
		
		System.out.println(c1 instanceof Object); //Object가 부모클래스이므로 객체가 맞음
		System.out.println(c1 instanceof Serializable); //인터페이스를 구현했으므로 객체가 맞음
		System.out.println(c1 instanceof Creature); // 본인클래스
		System.out.println(c1 instanceof Cat); // 자식클래스
		System.out.println();
		System.out.println(c2 instanceof Object); //Object가 부모클래스이므로 객체가 맞음
		System.out.println(c2 instanceof Serializable); //인터페이스를 구현했으므로 객체가 맞음
		System.out.println(c2 instanceof Creature); // c2는 creature객체가 들어가므로 객체타입은 creature이다.
		System.out.println(c2 instanceof Cat); // 자식클래스
		System.out.println();
		System.out.println(c3 instanceof Object); //Object가 부모클래스이므로 객체가 맞음
		System.out.println(c3 instanceof Serializable); //인터페이스를 구현했으므로 객체가 맞음
		System.out.println(c3 instanceof Creature); // 부모클래스
		System.out.println(c3 instanceof Cat); // 본인클래스
		System.out.println();
		System.out.println(c4 instanceof Object); //Object가 부모클래스이므로 객체가 맞음
		System.out.println(c4 instanceof Serializable); //인터페이스를 구현했으므로 객체가 맞음
		System.out.println(c4 instanceof Creature); // Cat객체는 Creature클래스의 자식클래스이다
		System.out.println(c4 instanceof Cat); // c4는 Cat객체가 들어가므로 객체타입은 Cat이다.
	}
}
