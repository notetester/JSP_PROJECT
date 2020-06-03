package quiz6;

public class Student {
	/*
	 * 맴버변수
	 * name - 학생이름
	 * no - 학생번호
	 * kor - 국어점수
	 * eng - 영어점수
	 * math - 수학점수
	 * 
	 * 생성자
	 * 5가지를 초기화하는 생성자
	 * 
	 * getTotal() - 국어, 영어, 수학 점수를 모두 더해서 합계 반환
	 * getAvg() - 총점을 나눈 평균을 반환(단, 소수점 2자리까지)
	 * 
	 * main에서는 학생 2명을 각각 생성하고 확인
	 */
	String name;
	int no,kor,eng,math;
	Student(){}
	Student(String name,int no,int kor,int eng,int math){
		this.name=name;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	int getTotal() {
		return kor+eng+math;
	}
	double getAvg() {
		return ((int)((getTotal()/3.0)*100))/100.0;
	}
}
