package overloading.basic;

public class MainClass {
	public static void main(String[] args) {
		Basic b=new Basic();
		b.input(1);
		b.input("1");
		b.input(1,3.14);
		b.input(3.14,1);
		Extra ex=new Extra();
		ex.input(1);
		ex.input(1,2);
		System.out.println(ex.input(1,2,3));
	}
}
