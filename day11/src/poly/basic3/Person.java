package poly.basic3;

public class Person {
	String name="이름x";
	int age=1;
	Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	Person(int age,String name) {
		this.name=name;
		this.age=age;
	}
	Person(int age) {
		this.name="이름x";
		this.age=age;
	}
	Person(String name) {
//		this.name=name;
//		this.age=1;
		this(name,1);
	}
	Person() {
//		this.name="이름x";
//		this.age=1;
		this("이름x",1);
	}
	String info() {
		return "이름 : "+name+", 나이 : "+age;
	}
}
