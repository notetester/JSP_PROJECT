package poly.basic3;

public class Teacher extends Person{
	String subject;//과목
	Teacher(String name,int age,String subject) {
//		this.name=name;
//		this.age=age;
		super(name,age);
		this.subject=subject;
	}
	Teacher(String name,int age) {
		this.name=name;
		this.age=age;
		this.subject="";
	}
	Teacher(String name) {
		this.name=name;
		this.age=1;
		this.subject="";
	}
	Teacher() {
		this.name="이름x";
		this.age=1;
		this.subject="";
	}
	String info() {
//		return "이름 : "+name+", 나이 : "+age+", 과목 : "+this.subject;
		return super.info()+", 학번 : "+this.subject;
	}
}
