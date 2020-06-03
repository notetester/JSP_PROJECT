package overriding.basic2;

public class MainClass {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.method1();
		p.method2();
		System.out.println("-------------------------------");
		Child c=new Child();
		c.method1();
		c.method2();
		c.method3();
		System.out.println("-------------------------------");
		Cc d=new Cc();
		d.method1();
		d.method2();
		d.method3();
		d.m();
		d.c();
	}
}
