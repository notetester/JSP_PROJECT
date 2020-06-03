package quiz15;

public class User {
	private String name="이름 없음";
	private int rrn=0;
	private int age=0;
	public User() {
		super();
		this.name="이름 없음";
		this.rrn=0;
		this.age=0;
	}
	public User(String name, int rrn, int age) {
		super();
		this.name = name;
		this.rrn = rrn;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRrn() {
		return this.rrn;
	}
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void print() {
		System.out.println("name : "+name+", rrn : "+rrn+", age : "+age);
	}
}
