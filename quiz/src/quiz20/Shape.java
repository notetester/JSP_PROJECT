package quiz20;

public abstract class Shape {
	private String name;
	public Shape(String name) {
		this.name=name;
	}
	//오버라이딩을 강제화한다면 추상메서드로 선언
	public abstract double gerArea();
	//오버라이딩을 강제화하지 않는다면 일반메서드로 선언
	public String getName() {
		return "도형 이름 : "+this.name;
	}
}
