package quiz6;

public class MainClass {
	public static void main(String[] args) {
		Student s1=new Student("김철수", 1111, 1000, 1900, 1700);
		Student s2=new Student("이영희", 2222, 1300, 1100, 1990);
		System.out.println(s1.name+"의 총점 : "+s1.getTotal()+", 평균 : "+s1.getAvg());
		System.out.println(s2.name+"의 총점 : "+s2.getTotal()+", 평균 : "+s2.getAvg());
	}
}
