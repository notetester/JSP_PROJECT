package static_.basic;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * 1. 녹색, 빨강색 계산기를 각각 생성
		 * 2. 계산기 색상을 확인하세요.
		 * 3. add(int a)메서드를 추가하비낟.
		 * 4. 계산기 result값도 각각 확인.
		 * 5. pi와 circle() 사용해서 원의 넓이를 구하세요.
		 */
		Calculator green=new Calculator();
		green.setColor("green");
		Calculator red=new Calculator();
		red.setColor("red");
		System.out.println("녹색 계산기 : "+green.getColor());
		System.out.println("빨강색 계산기 : "+red.getColor());
		System.out.println("=============================");
		green.add(100);
		red.add(200);
		System.out.println("녹색 계산기 값 : "+green.getResult());
		System.out.println("빨강색 계산기 값 : "+red.getResult());
		System.out.println("=============================");
		System.out.println("반지름 3인 원의 넓이 : "+Calculator.circle(3));
		System.out.println("반지름 5인 원의 넓이 : "+Calculator.circle(5));
		System.out.println("=============================");
		int[]arr= {1,2,3,4,5,6,7,8};
		System.out.println(ArrayPrint.printArray(arr));
	}
}
