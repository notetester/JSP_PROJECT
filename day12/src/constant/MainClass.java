package constant;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(Const.EARTH_RADIUS);
		System.out.println(Const.O2);
		System.out.println(Const.PI);
		System.out.println(Math.PI);
		System.out.println(Integer.BYTES);
		Child.a=10;
		Const.a=20;
		int b=Child.a;
		int c=Const.a;
		System.out.println(b);
		System.out.println(c);
	}

}
