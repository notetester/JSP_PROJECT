package quiz9;

public class MainClass {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(1);//매개변수 1개를 누적에 더함
		System.out.println("cal의 누적값 : "+cal.result);
		cal.add(2,3);//매개변수 2개를 누적에 더함
		System.out.println("cal의 누적값 : "+cal.result);
		cal.add(1,2,3);//매개변수 3개를 누적에 더함
		System.out.println("cal의 누적값 : "+cal.result);
		cal.add(1,2,3,4);//매개변수 4개를 누적에 더함
		System.out.println("cal의 누적값 : "+cal.result);
		System.out.println("------------------------------");
		String[]arr= {"홍길동","이순신"};
		ArrayPrint ap=new ArrayPrint();
		System.out.println(ap.printArray(arr));
		String[]sArr= {"홍길동","이순신","김길동"};
		int[]iArr= {1,2,3,4,5};
		char[]cArr= {'가','나'};
		System.out.println(ap.printArray(sArr));
		System.out.println(ap.printArray(iArr));
		System.out.println(ap.printArray(cArr));
	}
}
