package quiz11;

public class MainClass {
	public static void main(String[] args) {
		MyCart m=new MyCart(20000);
		m.buy("tv");
		m.buy("tv");
		m.buy("radio");
		m.buy("com");
		m.buy("radio");
		m.buy("com");
		m.buy("mouse");
		m.buy("tv");
	}
}
