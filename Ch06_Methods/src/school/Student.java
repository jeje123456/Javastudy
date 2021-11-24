package school;

public class Student {
	private String name;
	private int age;
	private boolean visible;
	private double temperature;
	
	// 생성자 생성
	// 마우스 우클릭 + source + generater Constructor using Fields
	public Student(String name, int age) {
		visible = true;
		temperature = 0;
		this.name = name;
		this.age = age;
	}
	
	// toString 메소드
	@Override
	public String toString() {
		return "학생 [이름 : " + name + ", 나이 : " + age + ", 집체 : " + visible + ", 체온 : " + temperature + "]";
	}


	// 자동완성 기능으로 getter setter 메소드 완성
	// 마우스 우클릭 + source + generater getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	

}
