package quiz20;

public class MainClass {
	public static void main(String[] args) {
		Shape r=new Rect("길이6인 정사각형",6);
		Shape c=new Circle("반지름7인 원",7);
		System.out.println(r.getName());
		System.out.println("넓이 : "+r.gerArea());
		System.out.println(c.getName());
		System.out.println("넓이 : "+c.gerArea());
	}
}
