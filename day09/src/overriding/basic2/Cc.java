package overriding.basic2;

public class Cc extends Child{
	void m() {
		System.out.println("변경부모");
	}
	void c() {
		System.out.println("변경자식");
	}
}
