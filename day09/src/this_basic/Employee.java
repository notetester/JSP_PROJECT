package this_basic;

public class Employee extends Person{
	String department;//부서
	Employee(String name,int age,String department) {
		this.name=name;
		this.age=age;
		this.department=department;
	}
	Employee(String name,int age) {
		this.name=name;
		this.age=age;
		this.department="";
	}
	Employee(String name) {
		this.name=name;
		this.age=1;
		this.department="";
	}
	Employee() {
		this.name="이름x";
		this.age=1;
		this.department="";
	}
	String info() {
		return "이름 : "+name+", 나이 : "+age+", 부서 : "+department;
	}
}
