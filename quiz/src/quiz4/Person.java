package quiz4;

public class Person {
	String name="";
	int age=0;
	int tall=0;
	Person(){
		name="";
		age=0;
		tall=0;
	}
	Person(String name,int age,int tall){
		this.name=name;
		this.age=age;
		this.tall=tall;
	}
	void info() {
		System.out.println(name);
		System.out.println(age+"세");
		System.out.println("키 : "+tall);
	}
}
