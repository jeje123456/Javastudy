package custom_hashset;

import java.util.HashSet;
import java.util.Objects;

class Creature {
	private int id;
	private String name;
	
	// 우클릭 - 소스 - generate constructor using fields
	public Creature(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	// id 값으로만 equals 메소드 생성
	// id가 중복되면 값이 입력안됨
	// id기준으로 보기 때문에 0번에 고양이가 있는 객체가 있으므로 true
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creature other = (Creature) obj;
		return id == other.id;
	}

	// 우클릭 - 소스 - generate toString
	@Override
	public String toString() {
		return "Creature [id=" + id + ", name=" + name + "]";
	}
}

public class App {

	public static void main(String[] args) {
		HashSet<Creature> creatures = new HashSet<>();
		
		creatures.add(new Creature(0, "고양이"));
		creatures.add(new Creature(1, "강아지"));
		creatures.add(new Creature(2, "호랑이"));
		creatures.add(new Creature(2, "호랑이"));
		creatures.add(new Creature(3, "삵"));
		creatures.add(new Creature(4, "표범"));
		creatures.add(new Creature(4, "치타"));
		
		System.out.println(creatures.contains(new Creature(0, "고양이")));
		// 새로운 객체이기 때문에 false
		creatures.forEach(System.out::println);
		// 순서대로 출력은 안됨.
		// 원래 중복은 입력 안되는데 각각 다른 객체이기 때문에 다 입력됨.
	}

}
