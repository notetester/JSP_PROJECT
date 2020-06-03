package static_.basic;

public class Calculator {
	/*
	 * 계산기마다 색깔이나 결과값은 다를 수 있기 때문에
	 * 일반 멤버변수로 선언합니다.
	 * 계산기마다 원주율은 동일하기 때문에 static변수로 선언하는게 좋습니다.
	 */
	private String color;
	private int result;
	public static double pi=3.14;
	public Calculator(){}
	public Calculator(String color){this.color=color;}
	public Calculator(int result){this.result=result;}
	public Calculator(String color,int result){
		this.color=color;
		this.result=result;
	}
	public Calculator(int result,String color){
		this.color=color;
		this.result=result;
	}
	/*
	 * 일반 맴버변수를 참조하고 이쓴ㄴ 메서드는 static메서드로
	 * 선언하면 안 됩니다.
	 */
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public void add(int a) {
		this.result+=a;
	}
	/*
	 * 메서드 내부에서 일반 멤버변수를 쓰지 않고
	 * 범용성 있게 사용하는 메서드는 static키워드를 사용하느 편이 좋습니다.
	 */
	public static double circle(int r) {
		return r*r*pi;
	}
	public static double rect(int side) {
		return side*side;
	}
	
}
