package this_basic;

public class MainClass {
	public static void main(String[] args) {
//		Student s=new Student();
//		s.name="홍길동";
//		s.age=20;
//		s.studentId="123123";
//		System.out.println(s.info());
//		Teacher t=new Teacher();
//		t.name="홍길자";
//		t.age=30;
//		t.subject="수학";
//		System.out.println(t.info());
//		Employee e=new Employee();
//		e.name="이순신";
//		e.age=50;
//		e.department="회계부";
//		System.out.println(e.info());
		Person p1=new Person("홍길자",20);
		Person p2=new Person("홍길동");
		Person p3=new Person();
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(p3.info());
		Employee e=new Employee("홍길순",20,"회계");
		System.out.println(e.info());
	}
}
