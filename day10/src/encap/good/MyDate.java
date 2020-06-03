package encap.good;

public class MyDate {
	private int year;
	private int month;
	private int day;
	private String ssn;//주민번호
	/*
	 * 은닉된 변수에 접근할 때는 클래스 설계자가 미리 생성해 놓은 
	 * getter/setter 메서드를 사용해서 데이터에 접근합니다.
	 * =========================
	 * setter 메서드 선언
	 * 1. 은닉변수에 값을 저장하기 위한 메서드
	 * 2. 접근제한자를 public으로 선언하고 이름은 set+맴버 변수 이름으로 지정
	 */
	public void setYear(int year) {
		if(year<1||year>2020) {
			System.out.println("잘못된 값 입력입니다");
		}else {
			this.year=year;
		}
	}
	/*
	 * getter 메서드 선언
	 * 1. 은닉 변수의 값을 조회하는 메서드
	 * 2. 접근제한자는 public 선언하고 이름은 get+맴버 변수 이름으로 지정
	 */
	public int getYear() {
		return this.year;
	}
	/*
	 * 1. month, day, ssn에 getter, setter 생성
	 * month - 1~12월 까지 만 저장
	 * day - 1~31일 까지
	 * ssn - 13자리 까지만 저장 가능 .length()
	 */
	public void setMonth(int month) {
		if(month<1||month>12) {
			System.out.println("잘못된 값 입력입니다");
		}else {
			this.month=month;
		}
	}
	public int getMonth() {
		return this.month;
	}
	public void setDay(int day) {
		if(day<1||day>31) {
			System.out.println("잘못된 값 입력입니다");
		}else {
			this.day=day;
		}
	}
	public int getDay() {
		return this.day;
	}
	public void setSsn(String ssn) {
		if(ssn.length()==13) {
			this.ssn=ssn;
		}else {
			System.out.println("잘못된 값 입력입니다");
		}
	}
	public String getSsn() {
		return this.ssn;
	}
	public void info() {
		System.out.println("생일 : "+year+"년 "+month+"월 "+day+"일");
		System.out.println("주민번호 : "+ssn);
	}
}
