package poly.instanceof_;

public class MainClass {
	public static void main(String[] args) {
		//다형성이 없다면?
//		Student hong=new Student("홍길동",20,"123");
//		Student park=new Student("박찬호",30,"234");
//		Student son=new Student("손흥민",40,"222");
//		Teacher lee=new Teacher("이승철",50,"음악");
//		Teacher kim=new Teacher("김유신",50,"역사");
//		Employee choi=new Employee("최강창민",20,"회계");
//		
//		Student[]arr1= {hong,park,son};
//		Teacher[]arr2= {lee,kim};
//		Employee[]arr3= {choi};
//		for(Student s:arr1) {
//			System.out.println(s.info());
//		}
		//다형성 적용
		Student hong=new Student("홍길동",20,"123");
		Teacher kim=new Teacher("김유신",50,"역사");
		Employee choi=new Employee("최강창민",20,"회계");
		printInfo(hong);
		printInfo(kim);
		printInfo(choi);
	}
	public static void printInfo(Person p) {
		if(p instanceof Student) {
			Student s=(Student)p;
			System.out.println(s.info());
		}else if(p instanceof Teacher) {
			Teacher t=(Teacher)p;
			System.out.println(t.info());
		}else if(p instanceof Employee) {
			Employee e=(Employee)p;
			System.out.println(e.info());
		}
	}
}
