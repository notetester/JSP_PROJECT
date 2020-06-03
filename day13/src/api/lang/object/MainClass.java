package api.lang.object;
public class MainClass {
	public static void main(String[] args) {
		Person p=new Person("홍길동");
		String name=p.getName();
		System.out.println(p.toString());
		System.out.println(name);
		Person p2=new Person("홍길동");
		System.out.println(p.equals(p2));
		System.out.println(p.getClass());
//		Class<?> gg=p.getClass();
		p=null;
		p2=null;
		System.gc();
	}
}