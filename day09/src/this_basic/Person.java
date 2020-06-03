package this_basic;

public class Person {
	String name;
	int age;
	Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	Person(String name) {
		this.name=name;
		this.age=1;
	}
	Person() {
		this.name="이름x";
		this.age=1;
	}
	String info() {
		return "이름 : "+name+", 나이 : "+age;
	}
}
