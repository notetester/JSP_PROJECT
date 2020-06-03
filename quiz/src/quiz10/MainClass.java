package quiz10;

public class MainClass {
	public static void main(String[] args) {
		/* 요구사항
		 * Calculator를 부모클래스로 선언하세요.
		 * Calculator를 상속받는 Computer클래스 생성 합니다.
		 * 
		 * Calculator의 멤버변수 result, pi를 선언하세요
		 * Calculator의 메서드
		 * add(int) - result에 값을 누적시키는 기능
		 * sub(int) - result에 값을 차감시키는 기능
		 * multi(int) - result에 값을 곱하기 기능 
		 * div(int) - result에 값을 나누는 기능
		 * circle(double) - pi를 이용해서 원의 넓이를 구하는 기능
		 * ------------------------------------------------------------------
		 * Computer 클래스의 메서드
		 * circle()메서드를 오버라이딩 하고, pi대신 하는 Math.PI를 사용해서 원의 넓이를 구하세요.
		 * rect(double) - 정사각형의 넓이
		 * rect(double, double) - 직사각형의 넓이
		 * rect(double, double, double) - 직육면체의 넓이
		 * 
		 * 
		 * 메인클래스에서 Calculator, Computer를 생성하고 메서드를 확인하세요.
		 */
		Calculator cal=new Calculator();
		System.out.println("cal의 result 값 : "+cal.result);
		System.out.println("3을 더한 cal의 result 값 : "+cal.add(3));
		System.out.println("1을 뺀 cal의 result 값 : "+cal.sub(1));
		System.out.println("4를 곱한 cal의 result 값 : "+cal.multi(4));
		System.out.println("2를 나눈 cal의 result 값 : "+cal.div(2));
		System.out.println("반지름이 2인 원의 넓이 : "+cal.circle(2));
		System.out.println("===========================================");
		Computer com=new Computer();
		System.out.println("com의 result 값 : "+com.result);
		System.out.println("3을 더한 com의 result 값 : "+com.add(3));
		System.out.println("1을 뺀 com의 result 값 : "+com.sub(1));
		System.out.println("4를 곱한 com의 result 값 : "+com.multi(4));
		System.out.println("2를 나눈 com의 result 값 : "+com.div(2));
		System.out.println("반지름이 2인 원의 넓이 : "+com.circle(2));
		System.out.println("길이가 3인 정사각형의 넓이 : "+com.rect(3));
		System.out.println("길이가 각각 3과 4인 직사각형의 넓이 : "+com.rect(3,4));
		System.out.println("길이가 각각 2와 3과 4인 직육면체의 부피 : "+com.rect(2,3,4));
	}
}
