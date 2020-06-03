package this_basic;

public class Student extends Person{
	String studentId;//학번
	Student(String name,int age,String studentId) {
		this.name=name;
		this.age=age;
		this.studentId=studentId;
	}
	Student(String name,int age) {
		this.name=name;
		this.age=age;
		this.studentId="";
	}
	Student(String name) {
		this.name=name;
		this.age=1;
		this.studentId="";
	}
	Student() {
		this.name="이름x";
		this.age=1;
		this.studentId="";
	}
	String info() {
		return "이름 : "+name+", 나이 : "+age+", 학번 : "+studentId;
	}
}
