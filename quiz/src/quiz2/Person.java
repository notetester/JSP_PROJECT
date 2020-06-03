package quiz2;

public class Person {
	String name="";
	int age=0;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void info() {
		System.out.println(name);
		System.out.println(age+"세");
	}
}
